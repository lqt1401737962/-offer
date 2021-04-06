package 动态规划;

/**
 * https://leetcode-cn.com/problems/minimum-path-sum/
 * @author Qitong!!
 * @Date 2020/6/26
 */
public class _64_最小路径和 {
    public int minPathSum(int[][] grid) {
        if (grid == null) return 0;

        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        //初始化
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for (int i = 1; i < columns; i++) {
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                dp[row][column] = Math.min(dp[row-1][column],dp[row][column-1])+ grid[row][column];
            }
        }
        return dp[rows-1][columns-1];
    }
}
