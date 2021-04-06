package 二刷;


/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_53_II_0_n_1_中缺失的数字 {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        //[li,ri)
        int li = 0, ri = nums.length;
        int mid = 0;
        while (li < ri) {
            mid = (ri + li) >> 1;
            if (nums[mid] == mid) {
                li = mid + 1;
            } else {
                ri = mid;
            }
        }
        return li;
    }
}
