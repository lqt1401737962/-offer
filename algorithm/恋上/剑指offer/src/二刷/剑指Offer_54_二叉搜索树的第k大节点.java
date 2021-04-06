package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_54_二叉搜索树的第k大节点 {
    private int res, k;

    public int kthLargest(TreeNode root, int k) {
        res = -1;
        this.k = k;

        inOrder(root);
        return res;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.right);
        if (k == 1) res = root.val;
        k--;
        inOrder(root.left);
    }
}
