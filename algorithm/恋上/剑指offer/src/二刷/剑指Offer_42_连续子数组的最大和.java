package 二刷;

import javax.swing.border.MatteBorder;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/6
 */
public class 剑指Offer_42_连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            if (dp <= 0) {
                dp = nums[i];
            } else {
                dp = nums[i] + dp;
            }
            max = Math.max(dp, max);
        }
        return max;
    }
}
