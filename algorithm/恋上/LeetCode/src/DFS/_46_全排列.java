package DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/permutations/
 * @author Qitong!!
 * @Date 2020/6/21
 */
public class _46_全排列 {
    private List<List<Integer>> list;
    private int[] result;
    private boolean[] used;
    private int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null)return null;
        list = new ArrayList<>();
        if (nums.length == 0 )return list;
        this.nums = nums;
        //储存 每一次的结果
        result = new int[nums.length];
        used = new boolean[nums.length];
        dfs(0);

        return list;
    }

    private void dfs(int index) {
        //到最后一层
        if (index == nums.length ){
            List<Integer> resList = new ArrayList<>();
            for (int val : result){
                resList.add(val);
            }
            list.add(resList);
        }
        //枚举每一层的可能
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;;
            result[index] = nums[i];
            used[i] = true;
            dfs(index+1);

            //还原现场
            used[i] = false;
        }
    }

}
