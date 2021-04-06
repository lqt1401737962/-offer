package 前行;

import org.omg.PortableServer.ForwardRequest;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/8/1
 */
public class 采购物资 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int[] prices = new int[n];
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
             prices[i] = sc.nextInt();
             values[i] = sc.nextInt();
        }
        System.out.println(maxValueExactly(values, prices, total));
    }

    public static int maxValueExactly(int[] values, int[] prices, int capacity) {
        if (values == null || values.length == 0) return 0;
        if (prices == null || prices.length == 0) return 0;
        if (values.length != prices.length || capacity <= 0) return 0;
        int[] dp = new int[capacity + 1];
        for (int j = 1; j <= capacity; j++) {
            dp[j] = Integer.MIN_VALUE;
        }
        for (int i = 1; i <= values.length; i++) {
            for (int j = capacity; j >= prices[i - 1]; j--) {
                dp[j] = Math.max(dp[j], values[i - 1] + dp[j - prices[i - 1]]);
            }
        }
        return dp[capacity] < 0 ? -1 : dp[capacity];
    }
}
