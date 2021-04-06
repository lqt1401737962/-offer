package 二叉树;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/symmetric-tree/
 * @author Qitong!!
 * @Date 2020/6/27
 */
public class _101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        //对称变有一个不为空 一个为空则为false;
        if (p == null&&q==null) return true;
        if (q == null||p==null) return false;
        //左子树的左和右子树的右      左子树的右和右子树的左
        return p.val==q.val&&isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}
