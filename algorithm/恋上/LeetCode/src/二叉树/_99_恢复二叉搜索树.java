package 二叉树;

import common.TreeNode;

/**
 * https://leetcode-cn.com/problems/recover-binary-search-tree/
 * @author Qitong!!
 * @Date 2020/6/17
 */
public class _99_恢复二叉搜索树 {
    //两个坏掉的树节点
    private TreeNode first;
    private TreeNode second;
    //记录 前一个结点
    private TreeNode preNode;

    /**
     * @Author Qitong~
     * @Description //TODO
     * @Date 19:51 2020/6/17
     * @Param [root]
     * @return void
     **/
    //使用递归遍历!时间复杂度O(N) 空间复杂度O(H)
    public void recoverTree(TreeNode root) {
        if (root == null) return;
        inOrder(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    private void inOrder(TreeNode node){
        if (node == null) return ;

        inOrder(node.left);
        //为处理逻辑
        findBadTreeNode( node);
        inOrder(node.right);
    }

    private void findBadTreeNode(TreeNode node) {
        if (preNode != null && preNode.val > node.val ){
            // 第2个错误节点：最后一个逆序对中较小的那个节点
            second = node;
            if (first != null) return;
            // 第1个错误节点：第一个逆序对中较大的那个节点
            first = preNode;
        }
        preNode = node;
    }



    //Morris遍历 时间O(N) 空间O(1)
    public void recoverTree2(TreeNode root) {
        if (root == null) return;
        Morris(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void Morris(TreeNode node){
        TreeNode cur = node;
        while (cur != null){
            if (cur.left != null){
                //找到前驱节点(predecessor)、后继节点(successor)
                TreeNode pred = cur.left;
                while (pred.right != null && pred.right != cur){
                    pred = pred.right;
                }
                if (pred.right == null){
                    pred.right = cur;
                    cur = cur.left;
                }else{
                    //处理逻辑! 打印之类...
                    findBadTreeNode(cur);
                    pred.right = null;
                    cur = cur.right;
                }

            }else{
                findBadTreeNode(cur);
                cur = cur.right;
            }
        }
    }
}
