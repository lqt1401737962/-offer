package 串;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/valid-anagram/
 * @author  Qitong!!
 * @Date 2020/6/13
 */
public class _242_有效的字母异位词 {

    /**
     * @Author Qitong~
     * @Description //TODO 输入: s = "anagram", t = "nagaram"
     *                      输出: true
     *                      说明:你可以假设字符串只包含小写字母。
     * @Date 19:10 2020/6/13
     * @Param [s, t]
     * @return boolean
     **/
    public boolean isAnagram1(String s, String t) {
        if (t== null&& s ==null ) return true;
        if (t== null || s == null) return false;
        if (s.length() != t.length()) return  false;

        int[] counts = new int[26] ;
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            counts[ss[i] - 'a']++;
            counts[ts[i] - 'a']--;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0)return false;
        }
        return true;

    }

    //利用系统自带的排序方法和比较方法
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null)return true;
        if (t== null || s == null) return false;
        if (s.length() != t.length()) return  false;

        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(ts);
        return ss.equals(ts);
    }
}
