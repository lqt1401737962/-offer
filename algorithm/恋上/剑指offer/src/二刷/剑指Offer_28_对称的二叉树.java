package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/3
 */
public class 剑指Offer_28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        //分开 进行!
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode lt, TreeNode rt) {
        if (lt == null && rt == null) return true;
        if (lt == null || rt == null) return false;
        //判断 这两个的值 是否相等   ,并且判断 左树的左子树和右树的右子树 ,左树的右子树和右树的左子树是否相等
        return lt.val == rt.val && isMirror(lt.left, rt.right) && isMirror(rt.left, lt.right);
    }
}
