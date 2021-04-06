package 二刷;

/**
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/1
 */
public class 剑指Offer_16_数值的整数次方 {
    //递归!! 分治的思想!     时间O(logN) 空间 O(logN)
    public double myPow(double x, int n) {
        //确定递归基!
        if (n == 0) return 1;
        if (n == -1) return 1 / x;
        double haft = myPow(x, n >> 1);
        haft *= haft;
        return (n & 1) == 1 ? haft * x : haft;
    }

    // 利用 二进制的 特征
    public double myPow2(double x, int n) {
        long y = n < 0 ? -((long) n) : n;
        double res = 1;
        while (y > 0) {
            // 如果最后一个二进制位是1，就累乘上x
            if ((y & 1) == 1) res *= x;

            x *= x;
            y >>= 1;
        }
        return x < 0 ? (1 / res) : res;
    }

}
