package com.qitong.判断回文链表;

import com.qitong.Jonephus.Node;

import java.util.Stack;

/*
请判断一个链表是否为回文链表。
示例 1:
    输入: 1->2
    输出: false
示例 2:
    输入: 1->2->2->1
    输出: true
进阶：
    你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

 */
public class 判断回文链表 {
    public static boolean isPalindrome(com.qitong.Jonephus.Node head){
        Stack<com.qitong.Jonephus.Node> res = new Stack<>();
        com.qitong.Jonephus.Node cur =head;
        while(cur != null) {
            res.push(cur);
            cur =cur.next;
        }
        while(head !=null){
            Node node=res.pop();
            if(head.val ==node.val){
                head =head.next;
            }else{
                return false;
            }
        }
        return true;
    }
}
