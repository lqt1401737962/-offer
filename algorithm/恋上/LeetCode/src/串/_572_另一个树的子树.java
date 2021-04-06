package 串;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/subtree-of-another-tree/
 * @author  Qitong!!
 * @Date 2020/6/13
 */
public class _572_另一个树的子树 {



    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (t == null) return true;
        if (s == null) return false;
//  KMP解
//        if (s == null || t == null) return false;
//        return contains(postSerialize(s), postSerialize(t));

        return postSerialize(s).contains(postSerialize(t)) ;
    }
    //序列化//后续
    String postSerialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        postSerialize(root,sb);
        return sb.toString();
    }
    private void postSerialize(TreeNode root,StringBuilder sb) {
        if (root.left == null){
            sb.append("#!");
        }else {
            postSerialize(root.left,sb);
        }
        if (root.right == null){
            sb.append("#!");
        }else{
            postSerialize(root.right,sb);
        }
        sb.append(root.val).append("!");
    }




    private boolean contains(String text, String pattern) {
        int plen = pattern.length();
        int tlen = text.length();
        if (tlen == 0 || plen == 0 || tlen < plen) return false;
        int[] next = next(pattern);
        int pi = 0, ti = 0;
        int tmax = tlen - plen;
        while (pi < plen && ti - pi <= tmax) {
            if (pi < 0 || text.charAt(ti) == pattern.charAt(pi)) {
                ti++;
                pi++;
            } else {
                pi = next[pi];
            }
        }
        return pi == plen;
    }

    private int[] next(String pattern) {
        int len = pattern.length();
        int[] next = new int[len];
        int i = 0;
        int n = next[i] = -1;
        int imax = len - 1;
        while (i < imax) {
            if (n < 0 || pattern.charAt(i) == pattern.charAt(n)) {
                i++;
                n++;
                if (pattern.charAt(i) == pattern.charAt(n)) {
                    next[i] = next[n];
                } else {
                    next[i] = n;
                }
            } else {
                n = next[n];
            }
        }
        return next;
    }
}
