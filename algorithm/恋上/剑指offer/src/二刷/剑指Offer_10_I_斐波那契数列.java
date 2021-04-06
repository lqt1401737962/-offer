package 二刷;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_10_I_斐波那契数列 {
    //考虑越界问题!!!!
    //递归! 时间O(2^n)
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    //优化 自底向上
    public static int fib2(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int one = 1;
        int two = 1;
        int res = 0;
        //待探究为什么 要模mod
        int mod = 10_0000_0007;
        for (int i = 3; i <= n; i++) {
            res = (one + two)% mod;
            one = two;
            two = res;
        }
        return res;
    }

    public static void main(String[] args) {
        double upMod = 10E9+7;
        int a =Integer.MAX_VALUE;
        System.out.println(upMod > a ? upMod:a);
        System.out.println(a);
        int b = 1_0000_00007;
    }
}
