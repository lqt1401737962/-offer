package 二刷;

import 二刷.common.TreeNode;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_34_二叉树中和为某一值的路径 {
    private List<List<Integer>> list;
    private List<Integer> res;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        list = new ArrayList<>();
        if (root == null) return list;
        res = new ArrayList<>();

        dfs(root, sum);
        return list;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            if (sum == 0) {
                list.add(new ArrayList<>(res));
            }
            return;
        }

        res.add(root.val);
        if (root.left == null) {
            dfs(root.right, sum - root.val);
        } else if (root.right == null) {
            dfs(root.left, sum - root.val);
        } else {
            dfs(root.left, sum - root.val);
            dfs(root.right, sum - root.val);
        }
        res.remove(res.size() - 1);
    }
}
