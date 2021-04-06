package com.qitong;

public class P07ConstructBinaryTreeByPreInOrder {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
//递归求解,第一步划分
    public static TreeNode constructBinaryTreeByPreInOrder(int[] preOrder,int[] inOrder,int preStart,int inStart,int length){
        if (length ==0){
            return null;
        }

        int rootIndex =0;
        for (int i = inStart; i < inStart+ length; i++) {
            if (preOrder[preStart] == inOrder[i]){
                rootIndex = i;
                break;
            }
        }
        int left_length = rootIndex -inStart;
        int right_length =length - left_length -1;

        TreeNode root =new TreeNode(preOrder[preStart]);

        root.left=constructBinaryTreeByPreInOrder(preOrder,inOrder,preStart+1, inStart,left_length);
        root.right=constructBinaryTreeByPreInOrder(preOrder,inOrder,preStart +left_length+1,rootIndex +1,right_length);

        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,7,3,5,6,8};
        int[] inOrder = {4,7,2,1,5,3,8,6};
        System.out.println(constructBinaryTreeByPreInOrder(preOrder, inOrder, 0, 0, 8).val);
    }
}
