package 二刷;

/**
 * https://leetcode-cn.com/problems/regular-expression-matching/
 *
 * @author Qitong!!
 * @Date 2020/7/1
 */
public class 剑指Offer_19_正则表达式匹配 {
    public boolean isMatch(String s, String p) {
        //动态规划  画图!!!和最小编辑距离类似
        int sl = s.length();
        int pl = p.length();
        boolean[][] dp = new boolean[sl + 1][pl + 1];

        //初始化 dp[0][0]  因为 boolean默认 为 false 所以s串那一列就不用初始化
        dp[0][0] = true;
        for (int i = 2; i <= pl; i++) {
            dp[0][i] = p.charAt(i - 1) == '*' && dp[0][i - 2];
        }

        for (int i = 1; i <= sl; i++) {
            for (int j = 1; j <= pl; j++) {
                if (p.charAt(j - 1) != '*') {
                    if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else {
                    //碰到"*" 看不看    有一种命中True即可
                    if (j >= 2) {
                        dp[i][j] = dp[i][j - 2];
                    }

                    if (j >= 2 && p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        //查看上面dp[i][j]情况
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        return dp[sl][pl];
    }
}

