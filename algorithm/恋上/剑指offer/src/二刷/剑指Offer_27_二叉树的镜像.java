package 二刷;

import 二刷.common.TreeNode;

import java.awt.*;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/3
 */
public class 剑指Offer_27_二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        //先序遍历  处理逻辑!!
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
