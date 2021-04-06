package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/
 * @author Qitong!!
 * @Date 2020/6/21
 */
public class _46_全排列2 {
    private List<List<Integer>> list;
    //用 动态数组 存储
    private List<Integer> result;

    private int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null)return null;
        list = new ArrayList<>();
        if (nums.length == 0 )return list;
        this.nums = nums;
        result = new ArrayList<>();
        dfs(0);

        return list;
    }

    private void dfs(int index) {
        //到最后一层
        if (index == nums.length ){
            list.add(new ArrayList<>(result));
            return;
        }
        //枚举每一层的可能
        for (int i = 0; i < nums.length; i++) {
            if (result.contains(nums[i])) continue;
            result.add(nums[i]);
            dfs(index+1);
            result.remove(result.size()-1);
        }
    }

}
