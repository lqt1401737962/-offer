package 高频题;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * @author Qitong!!
 * @Date 2020/6/21
 */
public class _1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null ) return null;
        //一遍遍历时间O(N) 空间O(N)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target-nums[i])) {
                return new int[]{i,hm.get(target-nums[i])};
            }else{
                hm.put(nums[i],i);
            }
        }
        return null;
    }

    //暴力法 时间O(N^2) 空间 O(1)
    public int[] twoSum2(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
