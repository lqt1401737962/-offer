package com.qitong;

import java.util.List;
import java.util.Stack;

public class P06FromHeadToTailPrintVal {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val =val;
        }
    }

    //创建一个栈
    public static void fromHeadToTail(ListNode head){
        Stack<ListNode> stack = new Stack<>();

        while (head!=null){
            stack.push(head);
            head =head.next;
        }
        while (!stack.isEmpty()){
            ListNode node = stack.pop();
            System.out.print(node.val+" ");
        }
    }

    //递归方法
    public static void formHeadToTailByRecursion(ListNode head){
        if (head==null){
            return;
        }
        formHeadToTailByRecursion(head.next);
        System.out.print(head.val+" ");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        fromHeadToTail(head);
        System.out.println();
        formHeadToTailByRecursion(head);
    }
}
