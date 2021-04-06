package 二刷;

import 二刷.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_37_序列化二叉树 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //后序序列化!
        if (root == null) return "#!";

        StringBuilder sb = new StringBuilder();
        postSerialize(root, sb);
        return sb.toString();
    }

    private void postSerialize(TreeNode root, StringBuilder sb) {
        if (root.left == null) {
            sb.append("#!");
        } else {
            postSerialize(root.left, sb);
        }
        if (root.right == null) {
            sb.append("#!");
        } else {
            postSerialize(root.right, sb);
        }
        sb.append(root.val).append("!");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strings = data.split("!");
        Deque<String> deque = new LinkedList<>();

        for (String string : strings) {
            deque.addFirst(string);
        }
        return postDeserialize(deque);
    }

    private TreeNode postDeserialize(Deque<String> deque) {
        String poll = deque.poll();
        if (poll.equals("#")) return null;

        TreeNode head = new TreeNode(Integer.valueOf(poll));
        head.right = postDeserialize(deque);
        head.left = postDeserialize(deque);

        return head;
    }

    public static void main(String[] args) {
        String s = "#";
        System.out.println(s == "#");
    }
}
