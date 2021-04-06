package com.qitong;

public class P23LoopOfLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //思路：
    //先判断链表是否存在环，使用快慢指针，快指针一次走两步，慢指针一次走一步，两个指针相遇，则说明链表有环，记录下相遇时候的节点LoopNode
    //计算环中的节点个数，从LoopNode节点出发，再次回到LoopNode，就得到了环中节点的个数k
    //设置两个指针p1和p2，让p1先走k步，然后p1和p2同时走，相遇时候的节点EntryNode即为环的入口节点
    public static ListNode loopNode(ListNode head){
        if (head==null||head.next==null||head.next.next==null){
            return null;
        }
        ListNode l1 = head.next;
        ListNode l2 = head.next;
        while (l1 != l2){
            if (l1.next ==null|| l2.next.next ==null){
                return null;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        l2 =head;
        while ( l1 != l2){
            l1 =l1.next;
            l2 =l2.next;
        }
        return l1;

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
        linkedList6.next = linkedList3;

        ListNode linkedList = new ListNode(linkedList4.val);
        System.out.println(linkedList.val);

    }

}
