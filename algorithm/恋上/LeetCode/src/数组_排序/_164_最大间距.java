package 数组_排序;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * https://leetcode-cn.com/problems/maximum-gap/
 * @author Qitong!!
 * @Date 2020/6/25
 */
public class _164_最大间距 {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length <2) return 0;
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i] - nums[i-1];
            if (val > max){
                max = val;
            }
        }
        return max;
    }

}
