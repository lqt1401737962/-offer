package com.qitong;
//复杂链表的复制
public class P35ComplexLinkedListCopy {
    static class ComplexLinkedListNode{
        int val;
        ComplexLinkedListNode next;
        ComplexLinkedListNode random;

        public ComplexLinkedListNode(int val) {
            this.val = val;
        }
    }

    public static ComplexLinkedListNode copy(ComplexLinkedListNode head){
        if (head ==null){
            return null;
        }
        //复制
        ComplexLinkedListNode cur=head;
        while (cur!= null){
            ComplexLinkedListNode copyNode = new ComplexLinkedListNode(cur.val);
            copyNode.next = cur.next;
            cur.next =copyNode;
            cur =copyNode.next;
        }

        //random点连接
         cur =head;
        while (cur!=null){
            ComplexLinkedListNode copyNode =cur.next;
            if (cur.random!=null){
                copyNode.random = cur.random.next;
            }
            cur = copyNode.next;
        }

        //拆分
        cur =head;
        ComplexLinkedListNode copyHead = head.next;
        while (cur.next!=null){
            ComplexLinkedListNode next = cur.next;
            cur.next = next.next;
            cur = next;


        }
        return copyHead;
    }

    public static void main(String[] args) {
        ComplexLinkedListNode node1 = new ComplexLinkedListNode(1);
        ComplexLinkedListNode node2 = new ComplexLinkedListNode(2);
        ComplexLinkedListNode node3 = new ComplexLinkedListNode(3);
        ComplexLinkedListNode node4 = new ComplexLinkedListNode(4);
        ComplexLinkedListNode node5 = new ComplexLinkedListNode(5);

        node1.next=node2;
        node2.next =node3;
        node3.next =node4;
        node4.next =node5;
        node5.next =null;

        node1.random =node3;
        node2.random =node5;
        node4.random =node2;

        ComplexLinkedListNode copy = copy(node1);
        while (copy!=null){
            System.out.print(copy.val+" ");
            copy = copy.next;
        }
    }
}
