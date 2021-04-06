package 二叉树;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/invert-binary-tree/
 *
 * @author 14017
 */
public class _226_翻转二叉树 {

	/**
	 * @Author Qitong~
	 * @Description //TODO  只要将处理逻辑放在响应的位置就可以达到效果!!可以用前中后层序遍历
	 * @Date 16:54 2020/6/26
	 * @Param [root]
	 * @return common.TreeNode
	 **/
	//前序遍历
   public TreeNode invertTree(TreeNode root) {
	   if (root == null) return root;

	   //处理逻辑!!!
	   TreeNode tmp = root.left;
	   root.left = root.right;
	   root.right = tmp;

       invertTree(root.left);
       invertTree(root.right);

       return root;
   }

   //后续遍历
	public TreeNode invertTree2(TreeNode root) {
	   if (root == null) return root;

		invertTree2(root.left);
		invertTree2(root.right);

	   TreeNode tmp = root.left;
	   root.left = root.right;
	   root.right = tmp;

       return root;
    }

    //中序遍历
	public TreeNode invertTree3(TreeNode root) {
	   if (root == null) return root;

		invertTree3(root.left);

	   TreeNode tmp = root.left;
	   root.left = root.right;
	   root.right = tmp;

		invertTree3(root.left);

       return root;
    }
    //层序遍历
	public TreeNode invertTree4(TreeNode root) {
		if (root == null) return root;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
		    TreeNode tmp = node.left;
		    node.left = node.right;
		    node.right = tmp;

			if (node.left != null) {
				queue.offer(node.left);
			}

			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		return root;
	}
}
