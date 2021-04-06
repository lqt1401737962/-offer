package 二刷;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/4
 */
public class 剑指Offer_33_二叉搜索树的后序遍历序列 {
    //递归做法!
    public boolean verifyPostorder(int[] postorder) {
        return process(postorder, 0, postorder.length - 1);
    }

    //[l,r]
    private boolean process(int[] postorder, int l, int r) {
        if (l >= r) return true;

        int p = l;
        while (postorder[p] < postorder[r]) p++;
        int m = p;
        while (postorder[p] > postorder[r]) p++;
        //根结点是否为最右边的!
        return p == r && process(postorder, l, m - 1) && process(postorder, m, r - 1);
    }
}
