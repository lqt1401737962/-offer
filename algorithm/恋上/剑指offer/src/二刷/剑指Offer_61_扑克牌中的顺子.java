package 二刷;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_61_扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        if (nums.length < 5) return false;
        Arrays.sort(nums);
        int joker = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) joker++;
            if (nums[i] != i + 1) return false;
        }
        return nums[4] - nums[joker] < 5;
    }
}
