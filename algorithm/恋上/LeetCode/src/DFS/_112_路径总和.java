package DFS;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/path-sum/
 * @author Qitong!!
 * @Date 2020/6/28
 */
public class _112_路径总和 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right==null){
            return sum == 0;
        }

        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);
    }


}
