package 二刷;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_10_I_青蛙跳台阶问题 {
    public static int numWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int one = 1;
        int two = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = one + two;
            one = two;
            two = res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numWays(4));
        System.out.println(Integer.MIN_VALUE);
    }
}
