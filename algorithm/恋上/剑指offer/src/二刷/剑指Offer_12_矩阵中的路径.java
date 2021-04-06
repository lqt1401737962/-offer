package 二刷;

/**
 * https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_12_矩阵中的路径 {
    private char[][] board;
    private char[] words;
    private boolean[][] flag;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        words = word.toCharArray();
        //是否访问过
        flag = new boolean[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (dfs(row, column, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(int row, int column, int index) {
        if (row >= board.length || column >= board[0].length || row < 0
                || column < 0
                || board[row][column] != words[index]
                || flag[row][column]) {
            return false;
        }
        if (index == words.length - 1) return true;
        //字符已访问，标记为true
        flag[row][column] = true;
        //递归遍历该字符傍边的字符，匹配成功，则路径长度加1
        boolean res = dfs(row - 1, column, index + 1) || dfs(row + 1, column, index + 1) ||
                dfs(row, column - 1, index + 1) || dfs(row, column + 1, index + 1);
        //回溯,该字符旁边的字符都不匹配，则说明这条路不符合，还原，将字符的遍历标记设置为false
        flag[row][column] = false;
        return res;
    }

}
