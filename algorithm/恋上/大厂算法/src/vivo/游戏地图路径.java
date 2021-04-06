package vivo;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/12
 */
//游戏地图路径
public class 游戏地图路径 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //起点的坐标
        int li = sc.nextInt();
        int ri = sc.nextInt();
        //终点的坐标
        int lj = sc.nextInt();
        int rj = sc.nextInt();
        //输入矩阵
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char[] ca = s.toCharArray();
            for (int i1 = 0; i1 < ca.length; i1++) {
                chars[i][i1] = ca[i1];
            }
        }
        //Main main = new Main();
        //main.exist(chars,li,ri,lj,rj)
    }

    private char[][] board;
    private char[] words;
    private boolean[][] flag;
    private int count;

    public int exist(char[][] board, int li,int ri,int lj,int rj) {
        this.board = board;

        //是否访问过
        flag = new boolean[board.length][board[0].length];

        //if (dfs(li,ri))return count;
        return -1;
    }

    public boolean dfs(int row, int column, int index) {
        if (row >= board.length || column >= board[0].length || row < 0
                || column < 0
                || flag[row][column]
                ) {
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
