package 二叉树;

import common.TreeNode;
import jdk.nashorn.internal.ir.BlockLexicalContext;

/**
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 *
 * @author Qitong!!
 * @Date 2020/6/26
 */
public class _98_验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }

    private boolean help(TreeNode root, Integer lower, Integer upper) {
        if (root == null) return true;

        if (lower != null && lower >= root.val) return false;
        if (upper != null && upper <= root.val) return false;
        return help(root.left, lower, root.val) && help(root.right, root.val, upper);
    }

    private Integer pre;

    public boolean isValidBST2(TreeNode root) {
        if (root == null) return true;

        if (!isValidBST2(root.left)) return false;

        if (pre != null && root.val <= pre) return false;
        pre = root.val;

        if (!isValidBST2(root.right)) return false;

        return true;
    }
}
