package com.qitong;



import java.util.Stack;

//之字型打印二叉树
public class P32_3ZPrintBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void printBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        boolean flag = true;
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (flag) {
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    System.out.print(node.val + " ");
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                }
                System.out.println();
            } else {
                while (!stack2.isEmpty()) {
                    TreeNode node = stack2.pop();
                    System.out.print(node.val + " ");
                    if (node.right != null) {
                        stack1.push(node.right);
                    }
                    if (node.left != null) {
                        stack1.push(node.left);
                    }
                }
                System.out.println();
            }
            flag =!flag;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode left21 = new TreeNode(4);
        TreeNode right21 = new TreeNode(5);
        TreeNode left22 = new TreeNode(6);
        TreeNode right22 = new TreeNode(7);

        root.left = left1;
        root.right = right1;
        left1.left = left21;
        left1.right = right21;
        right1.left = left22;
        right1.right = right22;

        printBinaryTree(root);

    }
}
