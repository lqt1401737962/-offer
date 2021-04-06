package 二刷;

/**
 * https://leetcode-cn.com/problems/chou-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/18
 */
public class 剑指Offer_49_丑数 {
    public int nthUglyNumber(int n) {
        //动态规划
        //定义状态 dp[n] = 就表示第n+1个 丑数
        int[] dp = new int[n];
        int a=0,b=0,c=0;
        //初始化
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a]*2,n3 = dp[b]*3,n5 = dp[5]*5;
            dp[i] = Math.min(Math.min(n2,n3),n5);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;
        }
        return dp[n-1];
    }
}
