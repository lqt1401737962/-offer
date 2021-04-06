package com.qitong;

public class P25MergeSortLinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //递归方法
    public static ListNode recursiveMerge(ListNode l1,ListNode l2){
        if (l1 == null ){
            return  l2;
        }
        if (l2 ==null){
            return l1;
        }
        if (l1.val< l2.val){
            l1.next=recursiveMerge(l1.next,l2);
            return l1;
        }else{
            l2.next =recursiveMerge(l1,l2.next);
            return l2;
        }


    }

}
