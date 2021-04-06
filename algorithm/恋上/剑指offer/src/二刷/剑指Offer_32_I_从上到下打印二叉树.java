package 二刷;

import 二刷.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/4
 */
public class 剑指Offer_32_I_从上到下打印二叉树 {
    //二叉树的层序遍历
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> temp = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode curNode = queue.poll();
            temp.add(curNode.val);
            if (curNode.left != null) queue.offer(curNode.left);
            if (curNode.right != null) {
                queue.offer(curNode.right);
            }
        }
        int[] res = new int[temp.size()];
        int curI = 0;
        for (Integer integer : temp) {
            res[curI++] = integer;
        }
        return res;
    }
}
