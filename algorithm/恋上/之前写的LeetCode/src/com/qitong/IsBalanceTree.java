package com.qitong;

import javax.swing.*;

public class IsBalanceTree {
    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val =val;
        }
    }
    static class ReturnType{
        int height;
        boolean isB;

        public ReturnType(boolean b,int h) {
            this.height=h;
            this.isB=b;
        }
    }

    public static boolean isBalance(TreeNode head){
        return process(head).isB;
    }

    public static  ReturnType process(TreeNode head){
        if (head ==null){
            return new ReturnType(true,0);
        }
        ReturnType leftType =process(head.left);
        if (!leftType.isB){
            return new ReturnType(false,0);
        }
        ReturnType rightType =process(head.right);
        if (!rightType.isB){
            return new ReturnType(false,0);
        }
        if (Math.abs(leftType.height-rightType.height)>1){
            return  new ReturnType(false,0);
        }
        return new ReturnType(true,Math.max(leftType.height,rightType.height)+1);
    }
}
