package 第四范式;

import java.util.*;

/**
 * @author Qitong!!
 * @Date 2020/8/24
 */
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int[] res = levelOrder(root);
        System.out.println(res[0]);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }



    // levelOrder
    public static int[] levelOrder(TreeNode root) {
        //特殊条件
        if (root == null) return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        //用list集合存储层序遍历的结果顺序~
        List<Integer> temp = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            temp.add(curNode.val);
            //若果左子树不空则加入
            if (curNode.left != null) queue.offer(curNode.left);
            //若右子树不空则加入
            if (curNode.right != null) queue.offer((curNode.right));
        }

        int[] res = new int[temp.size()];
        int index =0;
        for (Integer val : temp) {
            res[index++] = val;
        }
        return res;
    }

    static class  TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
