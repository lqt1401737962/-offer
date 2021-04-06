package 二刷;

/**
 * https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_14_I剪绳子 {
    //用 贪心做
    public int cuttingRope(int n) {
        if (n < 4) return n - 1;
        //3的次数!       除以三剩余多少!
        int threeTimes = 0, remain = 0, p = 1000000007;
        remain = n % 3;
        threeTimes = n / 3;
        if (remain == 1) return (int) (Math.pow(3, --threeTimes) * 4 % p);
        if (remain == 0) return (int) (Math.pow(3, threeTimes) % p);
        return (int) (Math.pow(3, threeTimes) * 2 % p);
    }

}
