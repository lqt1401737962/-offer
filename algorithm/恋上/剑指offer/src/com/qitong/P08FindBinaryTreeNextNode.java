package com.qitong;

public class P08FindBinaryTreeNextNode {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode findNextNode(TreeNode node){
        if (node ==null){
            return null;
        }
        //有右孩子,右孩子最左的节点
        if (node.right !=null ){
            return getMostLeft(node.right);
        }else{
            TreeNode parent = node.parent;
            while (parent != null && parent.left != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    //得到右子树最左的节点
    private static TreeNode getMostLeft(TreeNode node){
        if (node ==null){
            return null;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
}
