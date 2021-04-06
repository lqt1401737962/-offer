package important;

import common.TreeNode;

import java.util.*;

import tools.printer.BinaryTreeInfo;
import tools.printer.BinaryTrees;
/**
 * @author  Qitong!!
 * @Date 2020/6/13
 */
public class 二叉树的序列化和反序列化 {
    public static void main(String[] args) {
//        TreeNode node = new TreeNode(12);
//        node.right = new TreeNode(5);
//        node.left = new TreeNode(4);
//        node.left.left = new TreeNode(1);
//        node.left.right = new TreeNode(2);
        二叉树的序列化和反序列化 o = new 二叉树的序列化和反序列化();
//        String s = o.postSerialize(node);
//        System.out.println(s);
        TreeNode node = o.reconByPostString("#!#!1!#!#!2!4!#!#!5!12!");
        //System.out.println(node.val);
        BinaryTrees.println(new BinaryTreeInfo() {
            @Override
            public Object root() {
                return node;
            }

            @Override
            public Object left(Object node) {
                return ((TreeNode)node).left;
            }

            @Override
            public Object right(Object node) {
                return ((TreeNode)node).right;
            }

            @Override
            public Object string(Object node) {
                return ((TreeNode)node).val;
            }
        });
        System.out.println();
    }


    //后序序列化
    public String postSerialize(TreeNode root) {
        if (root == null) return"#!";
        StringBuilder sb = new StringBuilder();

        postSerialize(root,sb);
        return sb.toString();
    }
    private void postSerialize(TreeNode root,StringBuilder sb) {
        if (root.left == null){
            sb.append("#!");
        }else {
            postSerialize(root.left,sb);
        }
        if (root.right == null){
            sb.append("#!");
        }else{
            postSerialize(root.right,sb);
        }
        sb.append(root.val).append("!");
    }

    //反序列化!!
    public TreeNode reconByPostString(String s){
        String[] strings = s.split("!");
        Deque<String> queue = new LinkedList<>();
        for (String string : strings) {
            queue.offerFirst(string);
        }
        TreeNode root = reconByPostOrder(queue);
        return root;
    }

    private TreeNode reconByPostOrder(Queue<String> queue){
        String val = queue.poll();
        if (val.equals("#") ){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(val));
        head.right = reconByPostOrder(queue);
        head.left = reconByPostOrder(queue);
        return head;
    }
    public String preSerialize(TreeNode root) {
        if (root == null) return "!";
        StringBuilder sb = new StringBuilder("!");

        postSerialize(root,sb);
        return sb.toString();
    }



    private void preSerialize(TreeNode root,StringBuilder sb) {
        sb.append(root.val).append("!");
        if (root.left == null){
            sb.append("#!");
        }else {
            postSerialize(root.left,sb);
        }
        if (root.right == null){
            sb.append("#!");
        }else{
            postSerialize(root.right,sb);
        }
    }
}
