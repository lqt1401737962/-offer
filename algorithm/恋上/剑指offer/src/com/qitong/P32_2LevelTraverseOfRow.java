package com.qitong;

import java.util.*;

public class P32_2LevelTraverseOfRow {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //按行遍历,一层层打印
    public  LinkedList<LinkedList<Integer>> levelTraverse(TreeNode root){
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();
        if (root==null){
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size =queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }if (node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(temp);
        }
            return res;
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

        P32_2LevelTraverseOfRow test=new P32_2LevelTraverseOfRow();
        LinkedList<LinkedList<Integer>> res = test.levelTraverse(t1);
        System.out.println(res);
    }
}
