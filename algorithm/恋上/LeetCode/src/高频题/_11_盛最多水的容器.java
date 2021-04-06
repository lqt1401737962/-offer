package 高频题;

/**
 * https://leetcode-cn.com/problems/container-with-most-water/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _11_盛最多水的容器 {
    public int maxArea2(int[] height) {
        if (height == null || height.length<2) return 0;

        int l = 0,r = height.length-1,maxArea = 0;

        while (l < r){
            int minH =(height[l] <= height[r])? height[l++]: height[r--];
            maxArea = Math.max(maxArea,minH*(r-l+1));
            //排除 不可能的
            while (l< r && height[l]< minH) l++;
            while (l< r && height[r]< minH) r--;
        }
        return maxArea;
    }


    public int maxArea1(int[] height) {
        if (height == null || height.length<2) return 0;

        int l = 0,r = height.length-1,maxArea = 0;

        while (l < r){
           int minH =(height[l] <= height[r])? height[l++]: height[r--];
           maxArea = Math.max(maxArea,minH*(r-l+1));
        }
        return maxArea;
    }


    public int maxArea(int[] height) {
        if (height == null || height.length<2) return 0;

        //默认最大为左边第一个和右边最后一个之间的
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;

        while (l < r){
            if (height[l] <= height[r]){
                maxArea = Math.max(maxArea,(r-l) * height[l]);
                l++;
            }else{
                maxArea = Math.max(maxArea,(r-l) * height[r]);
                r--;
            }
        }
        return maxArea;
    }

}
