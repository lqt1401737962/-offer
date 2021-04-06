package com.qitong;
//对称的二叉树
public class P28SymmetryBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public boolean isSymmetryTree(TreeNode root){
        return process(root,root);
    }
    public boolean process(TreeNode root,TreeNode root2){
        if (root ==null &&root2==null){
            return true;
        }
        if ((root ==null || root2 ==null)){
            return false;
        }
        if (root.val!=root2.val){
            return false;
        }
        return process(root.left,root.right)&& process( root2.left,root2.right);

    }
}
