package com.qitong;

import com.qitong.环形链表.ListNode;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807

 */
public class 两数相加 {
    public static com.qitong.环形链表.ListNode sumTwoNumbers(com.qitong.环形链表.ListNode l1, com.qitong.环形链表.ListNode l2){
        com.qitong.环形链表.ListNode res = new com.qitong.环形链表.ListNode(0);
        com.qitong.环形链表.ListNode p =l1,q=l2,cur =res;
        int car= 0;
        while (p!= null || q!=null){
            int x = (p!= null)? p.val: 0;
            int y = (q!= null)? q.val: 0;
            int sum =x+y+car;
            car =sum/10;
            cur.next =new com.qitong.环形链表.ListNode(sum%10);
            cur =cur.next;
            if (p!=null) p =p.next;
            if(q !=null )q=q.next;
        }
        if (car > 0){
            cur.next =new ListNode(car);
        }
        return res.next;
    }
}
