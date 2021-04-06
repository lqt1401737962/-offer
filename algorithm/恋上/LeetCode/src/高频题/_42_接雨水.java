package 高频题;

import com.sun.deploy.panel.JHighDPITable;

import java.awt.event.HierarchyBoundsAdapter;

/**
 * https://leetcode-cn.com/problems/trapping-rain-water/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _42_接雨水 {

    /**
     * 空间复杂度O(1)，时间复杂度O(n)
     */
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int l = 0,r =height.length -1,lowerMax =0,water =0;
        while ((l <r)){
            //height[l],height[r]中较小的那个
            int lower = height[ height[l] <= height[r]? l++: r-- ];
            //目前为止最大的lower
            lowerMax = Math.max(lower,lowerMax);
            water += lowerMax - lower;
        }
        return water;
    }

    public int trap1(int[] height) {
        if (height == null || height.length == 0) return 0;

        int lastIdx = height.length - 2;

        int[] rightMaxes = new int[height.length];
        for (int i = lastIdx; i >= 1; i--) {
            rightMaxes[i] = Math.max(rightMaxes[i + 1], height[i + 1]);
        }

        // 遍历每一根柱子，看看每一根柱子上能放多少水
        int water = 0, leftMax = 0;
        for (int i = 1; i <= lastIdx; i++) {
            leftMax = Math.max(leftMax, height[i - 1]);
            // 求出左边最大、右边最大中的较小者
            int min = Math.min(leftMax, rightMaxes[i]);
            // 说明这根柱子不能放水
            if (min <= height[i]) continue;
            // 说明这根柱子能放水
            water += min - height[i];
        }

        return water;
    }


    public int trap2(int[] height) {
        if (height == null || height.length < 3 ) return 0;

        int lastIndex = height.length-2;
        int[] leftMaxes = new int[height.length];
        int[] rightMaxes = new int[height.length];

        for (int i = 1; i <= lastIndex ; i++) {
            leftMaxes[i] = Math.max(leftMaxes[i-1],height[i-1]);
        }
        for (int i = lastIndex; i >= 1 ; i--) {
            rightMaxes[i] = Math.max(rightMaxes[i+1],height[i+1]);
        }

        int water =0;
        // 遍历每一根柱子，看看每一根柱子上能放多少水
        for (int i = 1; i <= lastIndex; i++) {
            //求出左右两个柱子中的最大值的最小值!
            int min = Math.min(leftMaxes[i],rightMaxes[i]);
            if (min <= height[i]) continue;
            water += min-height[i];
        }
        return  water;
    }
}
