package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_07_重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null) return null;
        return findRoot(preorder, inorder, 0, 0, preorder.length);

    }

    private TreeNode findRoot(int[] preorder, int[] inorder, int preStart, int inStart, int len) {

        if (len == 0) return null;

        //找到在中序遍历中的 根结点的索引
        int rootIndex = 0;
        for (int i = inStart; i < inStart + len; i++) {
            if (preorder[preStart] == inorder[i]) {
                rootIndex = i;
                break;
            }
        }
        int leftLen = rootIndex - inStart;
        int rightLen = len - leftLen - 1;

        TreeNode root = new TreeNode(inorder[rootIndex]);
        root.left = findRoot(preorder, inorder, preStart + 1, inStart, leftLen);
        root.right = findRoot(preorder, inorder, preStart + leftLen + 1, rootIndex + 1, rightLen);
        return root;
    }
}

