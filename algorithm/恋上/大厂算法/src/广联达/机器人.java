package 广联达;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/9
 */
public class 机器人 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int C = sc.nextInt();
        float[] consume = new float[n];
        int[] values = new int[n];
        //初始化 价值数租和 消耗电量数组
        for (int i = 0; i < n; i++) {
            consume[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }


        System.out.println(maxValue(values, consume, C));
    }
    static int maxValue(int[] values, float[] consume, int capacity) {
        if (values == null || values.length == 0) return 0;
        if (consume == null || consume.length == 0) return 0;
        if (values.length != consume.length || capacity <= 0) return 0;
        int[] dp = new int[capacity + 1];
        for (int i = 1; i <= values.length; i++) {
            for (int j = capacity; j >= consume[i - 1]; j--) {
                dp[j] = Math.max(dp[j], values[i - 1] + dp[(int) (j - consume[i - 1])]);
            }
        }
        return dp[capacity];
    }

}
