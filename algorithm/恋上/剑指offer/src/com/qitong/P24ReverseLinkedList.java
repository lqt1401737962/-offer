package com.qitong;


//翻转链表
public class P24ReverseLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next =head.next;
            head.next = pre;
            pre =head;
            head =next;
        }
        return pre;
    }
    public static void main(String[] args) {
        ListNode linkedList1 = new ListNode(1);
        ListNode linkedList2 = new ListNode(2);
        ListNode linkedList3 = new ListNode(3);
        ListNode linkedList4 = new ListNode(4);
        ListNode linkedList5 = new ListNode(5);
        ListNode linkedList6 = new ListNode(6);
        linkedList1.next = linkedList2;
        linkedList2.next = linkedList3;
        linkedList3.next = linkedList4;
        linkedList4.next = linkedList5;
        linkedList5.next = linkedList6;
        ListNode reverseHead = reverseList(linkedList1);
        while (reverseHead!=null){
            System.out.println(reverseHead.val);
            reverseHead=reverseHead.next;
        }

    }
}
