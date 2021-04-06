package DFS;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/path-sum-ii/
 * @author Qitong!!
 * @Date 2020/6/28
 */
public class _113_路径总和II {
    private List<List<Integer>> list;
    private List<Integer> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        list= new ArrayList<>();
        if (root==null) return list;
        res = new ArrayList<>();

        dfs(root,sum);
        return list;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null ){
            if (sum == 0)list.add(new ArrayList<>(res));
            return ;
        }
        //穷举

        res.add(root.val);
        //剪纸 排除重复的答案
        if (root.right == null){
            dfs(root.left,sum-root.val);
        }else if (root.left == null){
            dfs(root.right,sum - root.val);
        }else{
            dfs(root.left,sum-root.val);
            dfs(root.right,sum - root.val);
        }
        res.remove(res.size() -1);
    }
}
