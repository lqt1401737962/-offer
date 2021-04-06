package 二刷;

import 二刷.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_36_二叉搜索树与双向链表 {
    TreeNode pre, head;

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;
        inOrder(root);
        //因为是双向链表!!最后将头尾相连,产生关系即可
        pre.right = head;
        head.left = pre;
        return head;
    }

    private void inOrder(TreeNode cur) {
        if (cur == null) return;

        inOrder(cur.left);
        //处理逻辑
        //如果 pre 为空则表示到达中序遍历的第一个结点,即为head
        //不空则 pre的 右指向 现在的结点
        if (pre != null) pre.right = cur;
        else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;

        inOrder(cur.right);
    }
}
