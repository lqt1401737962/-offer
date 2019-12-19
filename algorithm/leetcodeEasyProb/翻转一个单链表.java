package leetcode;

public class 翻转一个单链表 {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static Node reverseList(Node head ){
        if (head == null){
            return null;
        }
        Node pre =null;
        Node cur =head ;
        while (cur != null){
            Node temp =cur.next;
            cur.next =pre;
            pre =cur;
            cur = temp;
        }
        return pre;
    }

}
