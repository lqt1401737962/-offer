package 高频题;

/**
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 *
 * @author Qitong!!
 * @Date 2020/8/1
 */
public class _4_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        //左半边数组的长度 (默认左边多一个) 即为如果为长度奇数个,则答案在左半边
        int leftTotal = (nums1.length + nums2.length + 1) >> 1;

        int left = 0;
        int right = nums1.length;
        // 使得 nums1[i - 1] <= nums2[j] && nums2[j - 1] <= nums1[i]
        while (left < right) {
            int i = (left + right + 1) >> 1;
            int j = leftTotal - i;
            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                left = i;
            }
        }

        int i = left;
        int j = leftTotal - i;
        //找到左边最大值,和两个数组右边最小值
        int num1leftMax = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int num1RightMin = i == nums1.length ? Integer.MAX_VALUE : nums1[i];
        int num2leftMax = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int num2RightMin = j == nums2.length ? Integer.MAX_VALUE : nums2[j];

        if (((nums1.length + nums2.length) & 1) == 1) {
            return Math.max(num1leftMax, num2leftMax);
        } else {
            int res = Math.max(num1leftMax, num2leftMax) + Math.min(num1RightMin, num2RightMin);
            return (double) res / 2;
        }
    }
}
