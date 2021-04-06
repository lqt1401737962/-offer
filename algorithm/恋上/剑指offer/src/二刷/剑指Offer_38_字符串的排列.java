package 二刷;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_38_字符串的排列 {
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        if (chars == null) return null;
        List<String> list = new ArrayList<>();
        if (chars.length == 0) return new String[0];
        dfs(0, chars, list);
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void dfs(int index, char[] chars, List<String> list) {
        //到最后一层
        if (index == chars.length) {

            list.add(String.valueOf(chars));
            return;
        }

        //枚举这一层可以做的选择
        for (int i = index; i < chars.length; i++) {
            //保证每一个位置只出现一次
            if (isRepeat(chars, index, i)) continue;
            swap(chars, index, i);
            dfs(index + 1, chars, list);
            swap(chars, index, i);
        }
    }

    private boolean isRepeat(char[] chars, int index, int i) {
        for (int j = index; j < i; j++) {
            if (chars[j] == chars[i]) return true;
        }
        return false;
    }

    private void swap(char[] chars, int index, int i) {
        char temp = chars[index];
        chars[index] = chars[i];
        chars[i] = temp;
    }
}
