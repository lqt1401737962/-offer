package 二刷;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/20
 */
public class 剑指Offer_48_最长不含重复字符的子字符串 {
    //优化! 可能只是ASCII表里面的单字符!无中文韩文.....
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        char[] chars = s.toCharArray();
        //用来保存每一个字符上一次出现的位置
        int[] preIndex = new int[128];
        //初始化!
        for (int i = 0; i < preIndex.length; i++) {
            preIndex[i] = -1;
        }
        preIndex[chars[0]] = 0;
        //以i-1 位置字符结尾的最长不重复字符串的开始索引!
        int li = 0;
        int max = 1;
        for (int i = 1; i < chars.length; i++) {
            //得到i上一次出现的位置
            Integer pi = preIndex[chars[i]];
            if (li <= pi) {
                li = pi + 1;
            }
            //存储这个字符出现的位置
            preIndex[chars[i]] = i;
            max = Math.max(max, i - li + 1);
        }
        return max;
    }

    //用HashMap 可以存储所有的字符!!
    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) return 0;

        char[] chars = s.toCharArray();
        //用来保存每一个字符上一次出现的位置
        Map<Character, Integer> preIndex = new HashMap<>();
        preIndex.put(chars[0], 0);
        //以i-1 位置字符结尾的最长不重复字符串的开始索引!
        int li = 0;
        int max = 1;
        for (int i = 1; i < chars.length; i++) {
            //得到i上一次出现的位置
            Integer pi = preIndex.get(chars[i]);
            if (pi != null && li <= pi) {
                li = pi + 1;
            }
            //存储这个字符出现的位置
            preIndex.put(chars[i], i);
            max = Math.max(max, i - li + 1);
        }
        return max;
    }
}
