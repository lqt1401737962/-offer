package 动态规划;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 * @author Qitong!!
 * @Date 2020/6/15
 */
public class _5_最长回文子串 {

    /**
     * @Author Qitong~
     * @Description //TODO 输入: "babad"
     *                  输出: "bab"
     *                  注意: "aba" 也是一个有效答案。
     * @Date 20:41 2020/6/15
     * @Param [s]
     * @return java.lang.String
     **/

    //尝试暴力解!n^3

    // 暴力解法
    public String longestPalindrome2(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String test = s.substring(i, j);
                if (isPalindromic(test) && test.length() > max) {
                    ans = s.substring(i, j);
                    max = Math.max(max, ans.length());
                }
            }
        }
        return ans;
    }
    private boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }


    //动态规划 时间O(N^2) 空间O(N^2)
    public String longestPalindrome(String s) {

        if (s == null) return null;

        char[] chars = s.toCharArray();
        if (chars.length <= 0) return s;
        //最大回文子串的长度至少为1
        int maxLen = 1;
        //最长回文子串的开始索引
        int begin = 0;
        //记录是否为回文串
        boolean[][] dp = new boolean[chars.length][chars.length];
        //从下到上遍历
        for (int i = chars.length; i >= 0; i--) {
            //从左到右
            for (int j = i; j < chars.length; j++) {
                int len = j- i +1;
                dp[i][j] = (chars[i] == chars[j]) && (len <=2 || dp[i+1][j-1]);
                if (dp[i][j] && len> maxLen){
                    maxLen = len;
                    begin = i;
                }
            }
        }
        return new String( chars,begin,maxLen);
    }






    /**
     * 马拉车算法 时间O(N) 空间O(N)
     */
    public String longestPalindromeManacher(String s) {
        if (s == null) return null;
        char[] oldCs = s.toCharArray();
        if (oldCs.length <= 1) return s;

        // 预处理
        char[] cs = preprocess(oldCs);
        // 构建m数组
        int[] m = new int[cs.length];
        int c = 1, r = 1, lastIdx = m.length - 2;
        int maxLen = 0, idx = 0;
        for (int i = 2; i < lastIdx; i++) {
            if (r > i) {
                int li = (c << 1) - i;
                m[i] = (i + m[li] <= r) ? m[li] : (r - i);
            }

            // 以i为中心，向左右扩展
            while (cs[i + m[i] + 1] == cs[i - m[i] - 1]) {
                m[i]++;
            }

            // 更新c、r
            if (i + m[i] > r) {
                c = i;
                r = i + m[i];
            }

            // 找出更大的回文子串
            if (m[i] > maxLen) {
                maxLen = m[i];
                idx = i;
            }
        }
        int begin = (idx - maxLen) >> 1;
        return new String(oldCs, begin, maxLen);
    }
    private char[] preprocess(char[] oldCs) {
        char[] cs = new char[(oldCs.length << 1) + 3];
        cs[0] = '^';
        cs[1] = '#';
        cs[cs.length - 1] = '$';
        for (int i = 0; i < oldCs.length; i++) {
            int idx = (i + 1) << 1;
            cs[idx] = oldCs[i];
            cs[idx + 1] = '#';
        }
        return cs;
    }
}
