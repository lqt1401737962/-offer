package com.qitong.树;


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

    /*
     * @Author Qitong~
     * @Description //TODO
     * @Date 17:44 2020/5/25
     * @Param [a]
     * @return void
     **/
        public static void test(int... a  ){
            System.out.println(Arrays.toString(a));

        }

    public static void main(String[] args) {
        test(1,23,4,5,67,99);
    }


}
