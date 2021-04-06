package com.qitong;

//链表中第倒数k个节点
public class P22TheLIstLastKthNode {
    static class ListNode{
        int val ;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode getLastKNode(ListNode head,int k){
        if (head==null){
            throw new RuntimeException("error!head is null!!");
        }
        if (k == 0){
            throw new RuntimeException("Error ! The k cannot be zero!");
        }
        ListNode p1=head;
        ListNode p2 =head;
        int i =0;
        while (i!= (k-1)){
            if (p1.next==null){
                throw new RuntimeException("你输入的k值有问题!!");
            }
            p1 =p1.next;
            i++;
        }
        while (p1.next!=null){
            p2 =p2.next;
            p1 =p1.next;
        }
        return  p2;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode=getLastKNode(listNode1,0);
        System.out.println(listNode.val);
    }

}
