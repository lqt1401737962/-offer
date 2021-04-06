package 二刷;

/**
 * https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_53_I在排序数组中查找数字_I {
    public int search(int[] nums, int target) {
        //找到 左右边界
        // 找到 右边界 相减                 左边界为第一个小于target的值的
        return process(nums, target) - process(nums, target - 1);
    }

    private int process(int[] nums, int target) {
        //左右索引,不包括右!!
        int li = 0, ri = nums.length;

        while (li < ri) {
            int mid = (li + ri) >> 1;
            if (nums[mid] > target) {
                ri = mid;
            } else {
                li = mid;
            }
        }
        return ri - 1;
    }
}
