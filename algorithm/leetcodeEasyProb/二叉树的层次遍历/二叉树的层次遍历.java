package leetcode.二叉树的层次遍历;

import java.util.*;

public class 二叉树的层次遍历 {
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res =new ArrayList<>();
        if (root ==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int length =q.size();
            ArrayList<Integer> tem = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode cur = q.poll();
                tem.add(cur.val);
                if (cur.left!=null){
                    q.add(cur.left);
                }if (cur.right!=null){
                    q.add(cur.right);
                }
            }
            res.add(tem);
        }
        Collections.reverse(res);
        return res;
    }


}
