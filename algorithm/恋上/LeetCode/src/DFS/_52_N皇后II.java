package DFS;

/**
 * https://leetcode-cn.com/problems/n-queens-ii/
 *
 * @author Qitong!!
 * @Date 2020/6/28
 */
public class _52_N皇后II {

    //数组索引是行号，数组元素是列号
    private int[] columns;
    //一共多少种方法!
    private int ways;

    public int totalNQueens(int n) {
        if (n < 1) return 0;
        columns = new int[n];

        dfs(0);
        return ways;
    }

    private void dfs(int row) {
        //到最后一行,即合法可以摆放皇后
        if (row == columns.length) {
            ways++;
            return;
        }

        for (int column = 0; column < columns.length; column++) {
            //判断是否合法!
            if (!isValid(row, column)) continue;
            columns[row] = column;
            dfs(row + 1);
        }
    }

    private boolean isValid(int row, int column) {
        for (int i = 0; i < row; i++) {
            //第column 列已经有皇后了
            if (columns[i] == column) {
                return false;
            }
            //第 i 行的皇后row行 column列 处在同一直线上
            if (row - i == Math.abs(column - columns[i])) {
                return false;
            }
        }
        return true;
    }
}
