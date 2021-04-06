package 哔哩哔哩;

import java.util.Scanner;

/**https://www.nowcoder.com/question/next?pid=20725618&qid=643390&tid=35868163
 * @author Qitong!!
 * @Date 2020/8/12
 */
public class z0_1背包问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxWeight = sc.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];
        //初始化 价值数租和 重量数组
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        System.out.println(maxValueExactly(values, weights, maxWeight));
    }
    public static int maxValueExactly(int[] values, int[] weights, int capacity) {
        if (values == null || values.length == 0) return 0;
        if (weights == null || weights.length == 0) return 0;
        if (values.length != weights.length || capacity <= 0) return 0;
        int[] dp = new int[capacity + 1];
        for (int j = 1; j <= capacity; j++) {
            dp[j] = Integer.MIN_VALUE;
        }
        for (int i = 1; i <= values.length; i++) {
            for (int j = capacity; j >= weights[i - 1]; j--) {
                dp[j] = Math.max(dp[j], values[i - 1] + dp[j - weights[i - 1]]);
            }
        }
        return dp[capacity] < 0 ? -1 : dp[capacity];
    }
}
