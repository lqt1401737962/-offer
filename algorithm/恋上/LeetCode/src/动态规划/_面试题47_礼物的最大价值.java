package 动态规划;

/**
 * https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 * @author  Qitong!!
 * @Date 2020/6/14
 */
public class _面试题47_礼物的最大价值 {
    public int maxValue(int[][] grid) {
        if (grid == null) return 0;

        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        //特殊情况 第 0 行 初始化
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        //第0 列初始化
        for (int i = 1; i <columns ; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                dp[row][column] = Math.max(dp[row -1][column],dp[row][column -1])+grid[row][column];
            }
        }
        return dp[rows-1][columns-1];

    }

    
}
