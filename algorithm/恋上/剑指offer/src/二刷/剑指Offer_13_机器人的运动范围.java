package 二刷;


/**
 * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_13_机器人的运动范围 {
    private int m;
    private int n;
    private int k;
    private int count;
    private boolean[][] mark;
    private int[][] matrix;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        mark = new boolean[m][n];
        //记录 每个格子里的 个位数的和
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = getVal(i) + getVal(j);
            }
        }

        return process(0, 0);
    }

    private int process(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || mark[i][j] || matrix[i][j] > k) return 0;
        //将 访问的元素 标记为true
        mark[i][j] = true;
        count = 1 + process(i - 1, j) + process(i + 1, j) + process(i, j - 1) + process(i, j + 1);
        return count;
    }

    //给定一个数!返回他各个位数相加
    private int getVal(int n) {
        if (n < 10) return n;
        int res = 0;
        while (n > 0) {
            int mod = n % 10;
            n /= 10;
            res += mod;
        }
        return res;
    }

//    public static void main(String[] args) {
//        System.out.println(getVal(44));
//        System.out.println(getVal(4));
//        System.out.println(getVal(444));
//    }
}
