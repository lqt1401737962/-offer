package com.qitong;

import java.util.List;

public class P18DeleteNodeOfTable {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode deleteNode(ListNode head,ListNode delete){
        if (delete.next != null){
            delete.val = delete.next.val;
            delete.next =delete.next.next;
        }else{
            if (delete ==head){
                head = null;
            }else {
                //最后delete为一个结点
                ListNode cur = head;
                while (cur.next != delete){
                    cur =cur.next;
                }
                cur.next =null;
            }
        }
        return head;
    }

    public static void print(ListNode head){
        while (head !=null){
            System.out.println(head.val+"");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode head = deleteNode(node1, node5);

        print(head);


    }
}
