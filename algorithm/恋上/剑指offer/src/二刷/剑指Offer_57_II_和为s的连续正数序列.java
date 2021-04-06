package 二刷;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/11
 */
public class 剑指Offer_57_II_和为s的连续正数序列 {
    public int[][] findContinuousSequence(int target) {
        if (target <= 0) return null;
        //记录符合条件的值
        List<int[]> list = new ArrayList<>();
        //双指针,默认从1开始 如果l= r 则不符合结束!!
        for (int l = 1, r = 2; l < r; ) {
            //根据等差数列的求和!!
            int sum = (l + r) * (r - l + 1) >> 1;
            //如果命中!则 ..处理逻辑
            if (sum == target) {
                int[] res = new int[r - l + 1];
                for (int i = l; i <= r; i++) {
                    res[i - l] = i;
                }
                list.add(res);
                r++;
            } else if (sum > target) {
                l++;
            } else {
                r++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
