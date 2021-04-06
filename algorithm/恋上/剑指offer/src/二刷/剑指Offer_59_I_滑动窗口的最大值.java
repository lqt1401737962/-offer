package 二刷;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_59_I_滑动窗口的最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) return new int[0];
        int[] res = new int[nums.length - k + 1];

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int w = i - k + 1;
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offer(i);
            if (w < 0) {
                continue;
            }
            if (w > queue.peekFirst()) {
                queue.pollFirst();
            }
            res[w] = nums[queue.peekFirst()];
        }
        return res;
    }
}
