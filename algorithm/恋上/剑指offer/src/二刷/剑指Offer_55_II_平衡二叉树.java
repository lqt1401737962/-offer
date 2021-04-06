package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_55_II_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int lLength = depth(root.left);
        int rLength = depth(root.right);
        if (Math.abs(lLength - rLength) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;

        int lLength = depth(root.left);
        int rLength = depth(root.right);
        return Math.max(lLength, rLength) + 1;
    }
}
