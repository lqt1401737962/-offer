package 二刷;

import 二刷.common.TreeNode;

import java.time.temporal.Temporal;
import java.util.*;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/4
 */
public class 剑指Offer_32_III从上到下打印二叉树III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //增加标志位! flag为 true表示从右往左打印
        boolean flag = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                temp.add(curNode.val);
                if (curNode.left != null) queue.offer(curNode.left);
                if (curNode.right != null) queue.offer(curNode.right);
            }
            if (flag) Collections.reverse(temp);
            flag = !flag;
            res.add(temp);
        }
        return res;
    }
}
