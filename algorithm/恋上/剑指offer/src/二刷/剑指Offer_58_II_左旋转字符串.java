package 二刷;

/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_58_II_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {

        char[] chars = s.toCharArray();
        char[] res = new char[chars.length];
        int cur = 0;
        for (int i = n; i < chars.length; i++) {
            cur = i - n;
            res[cur] = chars[i];
        }
        for (int i = 0; i < n; i++) {
            res[cur++] = chars[i];
        }
        return String.valueOf(res);
    }

    public String reverseLeftWords2(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
