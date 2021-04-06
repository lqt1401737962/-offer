package 二刷;

import 二刷.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/2
 */
public class 剑指Offer_26_树的子结构 {
    //子结构 , 不是 子树!!
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;

        return recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }
    private boolean recur(TreeNode A,TreeNode B){
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;

        return recur(A.left, B.left)&&recur(A.right,B.right);
    }

}
