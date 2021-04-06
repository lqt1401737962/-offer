package 二叉树;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * @author Qitong!!
 * @Date 2020/6/17
 */
public class _236_二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        //包含了三种情况 ① 左边为空,右边不为空
        //② 右边为空,左边不为空
        //③ 都为空,既找不到  则返回null
        return left != null? left: right;
//        if (left ==null){
//            return right;
//        }
//        if (right == null){
//            return left;
//        }
//        return null;

    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;

        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if (left!= null && right!= null) return root;
        return left==null? right:left;
    }

}
