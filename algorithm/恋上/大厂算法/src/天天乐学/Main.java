package 天天乐学;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Qitong!!
 * @Date 2020/8/31
 */
class Main16 {
    public static void main(String[] args) {
        Main16 instance = new Main16();
        MyNode root;
        root = instance.generateBinaryTree();
        System.out.println("BEFORE");
        instance.printBinaryTree(root);
        // fillBinaryTreeInfo
        instance.fillBinaryTreeInfo(root);
        System.out.println("\nAFTER");
        //
        instance.printBinaryTree(root);
    }

    public void printBinaryTree(MyNode root) {
        // TODO: 按照中序方式遍历二叉树，输出节点信息请调用printNode(node)
        if (root == null) return;
        printBinaryTree(root.leftLeaf);

        printNode(root);

        printBinaryTree(root.rightLeaf);
    }

    public void printNode(MyNode node) {
        System.out.print(node.number + "(" + node.parent + "," + node.sameDepthRight + "), ");
    }

    public void fillBinaryTreeInfo(MyNode root) {
        // TODO: 填充二叉树的父节点，以及同深度右节点信息
        if (root == null) return;
        Queue<MyNode> queue = new LinkedList<>();
        List<List<MyNode>> res = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<MyNode> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                MyNode node = queue.poll();
                temp.add(node);

                if (node.leftLeaf != null) {
                    queue.offer(node.leftLeaf);
                    node.leftLeaf.parent = node;
                }
                if (node.rightLeaf != null) {
                    queue.offer(node.rightLeaf);
                    node.rightLeaf.parent = node;
                }
            }
            res.add(temp);

        }

        for (List<MyNode> re : res) {

            if (re.size() > 1) {
                //找到同高的右边兄弟节点
                MyNode left = re.get(0);
                for (int i = 1; i < re.size(); i++) {
                    left.sameDepthRight = re.get(i);
                    left = left.sameDepthRight;
                }
            }
        }

    }

    public MyNode generateBinaryTree() {
        MyNode left, right, parent, root;
        left = new MyNode(1, null, null);
        right = new MyNode(3, null, null);
        parent = new MyNode(2, left, right);
        //4
        left = parent;
        right = new MyNode(5, null, null);
        parent = new MyNode(4, left, right);

        //6
        root = new MyNode(6, parent, null);
        //9
        left = new MyNode(8, null, null);
        right = new MyNode(10, null, null);
        parent = new MyNode(9, left, right);
        //7
        right = parent;
        parent = new MyNode(7, null, right);
        root.setRightLeaf(parent);
        return root;
    }

    public static final class MyNode {
        // node  标号
        int number;
        // 左子节点
        MyNode leftLeaf;
        // 右子节点
        MyNode rightLeaf;
        // 父节点
        MyNode parent;
        // 同深度右节点
        MyNode sameDepthRight;

        public MyNode(int number, MyNode leftLeaf, MyNode rightLeaf) {
            this.number = number;
            this.leftLeaf = leftLeaf;
            this.rightLeaf = rightLeaf;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public MyNode getLeftLeaf() {
            return leftLeaf;
        }

        public void setLeftLeaf(MyNode leftLeaf) {
            this.leftLeaf = leftLeaf;
        }

        public MyNode getRightLeaf() {
            return rightLeaf;
        }

        public void setRightLeaf(MyNode rightLeaf) {
            this.rightLeaf = rightLeaf;
        }

        public MyNode getParent() {
            return parent;
        }

        public void setParent(MyNode parent) {
            this.parent = parent;
        }

        public MyNode getSameDepthRight() {
            return sameDepthRight;
        }

        public void setSameDepthRight(MyNode sameDepthRight) {
            this.sameDepthRight = sameDepthRight;
        }

        @Override
        public String toString() {
            return "MyNode{" +
                    "number=" + number +
                    '}';
        }
    }

}
