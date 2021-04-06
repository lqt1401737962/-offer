package com.qitong;

import java.util.LinkedList;

public class P32_1PrintBinaryTree {
    static class TreeNode{
        int val ;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //level Order
    public  static  void levelOrder(TreeNode root){
        if (root==null){
            return ;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.println(cur.val);
            if (cur.left!=null){
                queue.offer(cur.left);
            }if (cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left =t2;
        t1.right=t3;
        t2.left =t4;
        t2.right=t5;
        t3.left =t6;
        t3.right=t7;

        levelOrder(t1);

     }
}
