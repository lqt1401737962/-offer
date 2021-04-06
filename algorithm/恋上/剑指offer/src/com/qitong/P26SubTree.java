package com.qitong;
//26 树的子结构
public class P26SubTree {
    static class TreeNode{
        double val;
        TreeNode left;
        TreeNode right;

        public TreeNode(double val) {
            this.val = val;
        }
    }



    public static  boolean isSubTree(TreeNode t1,TreeNode t2){
        boolean res =false;
        if (t1 != null&& t2 != null){
            if (t1.val==t2.val){
                res = judge(t1,t2);
            }
            if (!res){
                res=isSubTree(t1.left,t2);
            }
            if (!res){
                res=isSubTree(t1.right,t2);
            }
        }
        return res;
    }

    private static boolean judge(TreeNode t1,TreeNode t2){
        if (t2==null){
            return true;
        }
        if (t1 ==null){
            return false;
        }
        if (!equals(t1,t2)){
            return false;
        }else{
            return judge(t1.left,t2.left)&&judge(t1.right,t2.right);
        }
    }

    private static boolean equals(TreeNode t1,TreeNode t2){
        if (Math.abs(t1.val -t2.val)<0.0000001){
            return true;
        }
        return false;
    }
}
