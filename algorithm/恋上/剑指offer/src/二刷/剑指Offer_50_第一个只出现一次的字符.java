package 二刷;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/7
 */
public class 剑指Offer_50_第一个只出现一次的字符 {
    //利用 HashMap来
    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0) return ' ';
        char[] chars = s.toCharArray();

        Map<Character,Boolean> map = new HashMap<>();
        for (char c :chars){
            if (map.containsKey(c)) {
                map.put(c,true);
            }else{
                map.put(c,false);
            }
        }
        for (char c : chars) {
            if (!map.get(c)) return c;
        }
        return ' ';
    }
}
