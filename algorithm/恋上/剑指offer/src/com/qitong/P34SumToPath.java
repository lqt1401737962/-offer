package com.qitong;

//二叉树中某数为某一路经和
public class P34SumToPath {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void getPath(TreeNode root,int target){

        process(root,target,"");
    }

    private static void process(TreeNode root,int tar,String str) {
        if (root ==null){
            return;
        }
        str =str + root.val +"-";
        tar =tar -root.val;
        if (tar ==0&& root.left==null&&root.right==null){
            System.out.println(str);
        }
        process(root.left,tar,str);
        process(root.right,tar,str);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(8);
        TreeNode left1 = new TreeNode(6);
        TreeNode right1 = new TreeNode(10);
        TreeNode left21 = new TreeNode(5);
        TreeNode right21 = new TreeNode(7);
        TreeNode left22 = new TreeNode(9);
        TreeNode right22 = new TreeNode(1);

        root.left = left1;
        root.right = right1;
        left1.left = left21;
        left1.right = right21;
        right1.left = left22;
        right1.right = right22;

        getPath(root,19);
    }
}
