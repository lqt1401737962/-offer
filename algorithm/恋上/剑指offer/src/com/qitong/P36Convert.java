package com.qitong;

import java.util.LinkedList;
import java.util.Queue;

//36 二叉搜索树与双向链表
public class P36Convert {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode convert(TreeNode root){
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        inOrder(root,queue);
        if (queue.isEmpty()){
            return root;
        }
        root = queue.poll();
        TreeNode pre =root;
        pre.left = null;
        TreeNode cur =null;
        while (!queue.isEmpty()){
            cur =queue.poll();
            pre.right = cur;
            cur.left =pre;
            pre =cur;
        }
        pre.right =null;
        return root;

    }

    public static void inOrder(TreeNode root, Queue<TreeNode> queue){
        if (root ==null){
            return ;
        }
        inOrder(root.left,queue);
        queue.offer(root);
        inOrder(root.right,queue);
    }
}
