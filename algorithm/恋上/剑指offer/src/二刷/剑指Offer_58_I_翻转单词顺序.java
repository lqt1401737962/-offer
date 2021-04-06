package 二刷;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_58_I_翻转单词顺序 {
    //官方jdk !!自带的
    public String reverseWords(String s) {
        if (s.length() == 0) return null;

        String sr = s.trim();
        List<String> strings = Arrays.asList(sr.split("\\s+"));
        Collections.reverse(strings);
        return String.join(" ", strings);
    }

    //自己实现一个方法!!效率高
    public String reverseWords2(String s) {

        if (s == null) return "";

        char[] chars = s.toCharArray();
        //存放字符串的实际长度!
        int len = 0;
        //存放当前准备存放 元素的位置
        int cur = 0;
        boolean flag = true;      //前一个字符是否为空格
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                chars[cur++] = chars[i];
                flag = false;
            } else if (flag == false) {
                chars[cur++] = ' ';
                flag = true;
            }
        }
        len = flag ? --cur : cur;
        if (len <= 0) return "";

        reverseWord(chars, 0, len);
        int preIndex = -1;
        for (int i = 0; i < len; i++) {
            if (chars[i] == ' ') {
                reverseWord(chars, preIndex + 1, i);
                preIndex = i;
            }
        }
        reverseWord(chars, preIndex + 1, len);

        return new String(chars, 0, len);
    }

    private void reverseWord(char[] chars, int l, int r) {
        r--;
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }
}
