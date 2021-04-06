package important;

import common.TreeNode;

/**
 * @author Qitong!!
 * @Date 2020/6/26
 */
public class Morris遍历 {
    //中序!!

    public static void Morris(TreeNode root){
        TreeNode cur = root;
        while (cur != null){
            if (cur.left != null){
                TreeNode pred = cur.left;
                while (pred.right!=null&& pred.right != cur){
                    pred = pred.right;
                }
                if (pred.right == null){
                    pred.right = cur;
                    cur = cur.left;
                }else{
                    System.out.println(cur.val);
                    pred.right = null;
                    cur = cur.right;
                }
            }else{
                System.out.println(cur.val);
                cur = cur.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(4);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(11);
        Morris(root);
    }
}
