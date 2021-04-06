package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations-ii/
 * @author Qitong!!
 * @Date 2020/6/21
 */
public class _47_全排列II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null) return null;
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 0) return list;
        dfs(0,nums,list);
        return list;
    }

    private void dfs(int index, int[] nums, List<List<Integer>> list) {
        //到最后一层
        if (index == nums.length){
            List<Integer> res = new ArrayList<>();
            for (int val: nums){
                res.add(val);
            }
            list.add(res);
            return;
        }

        //枚举这一层可以做的选择
        for (int i = index; i < nums.length; i++) {
            //保证每一个位置只出现一次
            if (isRepeat(nums,index,i)) continue;
            swap(nums,index,i);
            dfs(index+1,nums,list);
            swap(nums,index,i);
        }
    }

    private boolean isRepeat(int[] nums, int index, int i) {
        for (int j =index; j<i ;j++){
            if (nums[j] == nums[i]) return true;
        }
        return false;
    }
    private void swap(int[] nums ,int index,int i){
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }
}
