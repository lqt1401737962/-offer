package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/n-queens/
 *
 * @author Qitong!!
 * @Date 2020/6/28
 */
public class _51_N皇后 {

    //数组索引是行号，数组元素是列号
    private int[] columns;
    //保存 合法皇后的一行情况!!
    private char[] colP;
    private List<List<String>> list;
    private List<String> res;

    public List<List<String>> solveNQueens(int n) {
        list = new ArrayList<>();
        if (n < 1) return list;

        res = new ArrayList<>();
        columns = new int[n];
        colP = new char[n];

        dfs(0);
        return list;
    }

    //dfs模板!
    private void dfs(int row) {
        //判断达到 最后一行!及合法情况 处理逻辑!!
        if (row == columns.length) {
            show();
            list.add(new ArrayList<>(res));
            //要把之前的清除,否则会出现 后面的在前面的 基础上添加
            res.clear();
            return;
        }
        //枚举每种结果可能
        for (int column = 0; column < columns.length; column++) {
            //判断是否合法!
            if (!isValid(row, column)) continue;
            columns[row] = column;
            dfs(row + 1);
        }
    }

    //处理逻辑! 判断哪个位置是否可以放皇后! 剪枝操作!
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

    //打印逻辑!
    private void show() {
        for (int row = 0; row < columns.length; row++) {
            for (int col = 0; col < columns.length; col++) {
                if (columns[row] == col) {
                    colP[col] = 'Q';
                } else {
                    colP[col] = '.';
                }
            }
            //每一行 为一个字符串 添加
            res.add(String.valueOf(colP));
        }
    }
}
