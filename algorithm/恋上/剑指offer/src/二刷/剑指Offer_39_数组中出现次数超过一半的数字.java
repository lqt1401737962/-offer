package 二刷;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_39_数组中出现次数超过一半的数字 {
    public int majorityElement(int[] nums) {
        if (nums == null) return -1;
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    res = nums[i];
                    count = 1;
                }
            }
        }
        return res;
    }
}
