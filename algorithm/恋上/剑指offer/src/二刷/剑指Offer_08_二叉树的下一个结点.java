package 二刷;

/**
 * @author Qitong!!
 * @Date 2020/7/21
 */
public class 剑指Offer_08_二叉树的下一个结点 {
    private  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode findNextNode(TreeNode node){
        if (node == null) return null;
        //有右孩子!则为右孩子中最左的结点
        if (node.right!= null){
            return getMostLeft(node.right);
        }else{
            TreeNode parent = node.parent;
            while (parent!= null && parent.left != node){
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    //得到右子树最左的结点!!
    private TreeNode getMostLeft(TreeNode node) {
        while (node.left!= null){
            node = node.left;
        }
        return node;
    }

}
