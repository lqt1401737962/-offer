package 高频题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/3sum/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _15_三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null) return null;

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;

        //排序
        Arrays.sort(nums);
        //i来扫描 三元组的第一个元素
        int lastIndex = nums.length -3;
        int lastR = nums.length -1;
        for (int i = 0; i <= lastIndex; i++) {
            //去重
            if (i> 0 &&nums[i] == nums[i-1]) continue;

            int l = i+1, r = lastR, remain = -nums[i];
            while (l < r){
                int sumLr = nums[l] + nums[r];
                //表示找到了符合的三元数
                if (sumLr == remain){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    //去重
                    while (l<r && nums[l] == nums[l+1]){l++;}
                    while (l<r && nums[r] == nums[r-1]){r--;}
                    //向中间逼近!!
                    l++;
                    r--;
                }else if(sumLr < remain){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}
