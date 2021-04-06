package 动态规划;

/**
 * https://leetcode-cn.com/problems/edit-distance/
 * @author Qitong!!
 * @Date 2020/6/15
 */
public class _72_编辑距离 {
    /**
     * @Author Qitong~
     * @Description //TODO 输入：word1 = "horse", word2 = "ros"
     *                   输出：3
     *                  解释：
     *                  horse -> rorse (将 'h' 替换为 'r')
     *                  rorse -> rose (删除 'r')
     *                  rose -> ros (删除 'e')
     * @Date 20:16 2020/6/15
     * @Param [word1, word2]
     * @return int
     **/
    //困难!!!!
    public int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null ) return 0;

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        //定义状态 dp[i][j] 是 s1[0,i) 转换成 s2[0,j)的最少操作次数
        int[][] dp = new int[chars1.length+1][chars2.length+1];
        //初始化
        dp[0][0] = 0;
        for (int i = 0; i <= chars1.length; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= chars2.length; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                int top = dp[i-1][j] +1;
                int left = dp[i][j-1] +1;
                int leftTop = dp[i-1][j-1];
                if (chars1[i-1] != chars2[j-1]){
                    leftTop++;
                }
                dp[i][j]=Math.min(Math.min(top,left),leftTop);
            }
        }
        return dp[chars1.length][chars2.length];
    }

}
