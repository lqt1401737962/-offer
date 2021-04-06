package 二刷;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/11
 */
public class 剑指Offer_57_和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[0];
        int l = 0, r = nums.length - 1;

        while (l < r) {
            if (target == (nums[l] + nums[r])) return new int[]{nums[l], nums[r]};
            if (target > (nums[l] + nums[r])) l++;
            else {
                r--;
            }
        }
        return new int[0];
    }
}
