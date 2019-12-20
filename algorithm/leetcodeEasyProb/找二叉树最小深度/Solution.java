package leetcode.找二叉树最小深度;

public class Solution {
    public static int searchBinaryTreeMinDep(TreeNode root ){
        if (root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int min =Integer.MAX_VALUE;
        if (root.left !=null){
            min = Math.min(searchBinaryTreeMinDep(root.left),min);
        }
        if (root.right != null){
            min =Math.min(searchBinaryTreeMinDep(root.right),min);
        }

        return min +1;
    }

}
