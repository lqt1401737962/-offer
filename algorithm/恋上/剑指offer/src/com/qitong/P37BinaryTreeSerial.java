package com.qitong;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的序列化和反序列化
public class P37BinaryTreeSerial {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static String serialization(TreeNode root){
        if (root == null){
            return "#!";
        }
        String res =root.val + "!";
        res += serialization(root.left);
        res += serialization(root.right);
        return res;
    }


    public static TreeNode unSerialization(String str){
        String[] strs = str.split("!");
        Queue<String> queue =new LinkedList<String>();
        for (String s : strs) {
            queue.offer(s);
        }
        return reconPreOrder(queue);
    }
    public static TreeNode reconPreOrder(Queue<String> queue){
        String poll = queue.poll();
        if (poll.equals("#")){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(poll));
        head.left =reconPreOrder(queue);
        head.right =reconPreOrder(queue);
        return head;
    }
}
