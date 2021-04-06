package 二刷;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/19
 */
public class 剑指Offer_45_把数组排成最小的数 {
    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo((y+x)));
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
