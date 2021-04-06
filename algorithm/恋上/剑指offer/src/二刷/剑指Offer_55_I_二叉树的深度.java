package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_55_I_二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return preOrder(root);
    }

    private int preOrder(TreeNode root) {
        if (root == null) return 0;

        int lLength = preOrder(root.left);
        int rLength = preOrder(root.right);
        return Math.max(lLength, rLength) + 1;
    }
}
