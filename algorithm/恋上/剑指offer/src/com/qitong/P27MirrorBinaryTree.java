package com.qitong;

public class P27MirrorBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void mirrorBinaryTree(TreeNode root){
        if (root ==null){
            return ;
        }
        if (root.left==null|| root.right==null){
            return ;
        }
        TreeNode temp =root.left;
        root.left = root.right;
        root.right=temp;

        if (root.left!=null) {
            mirrorBinaryTree(root.left);
        }
        if (root.right!=null){
            mirrorBinaryTree(root.right);
        }

    }
}
