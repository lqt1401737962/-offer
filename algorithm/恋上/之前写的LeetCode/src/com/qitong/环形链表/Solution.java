package com.qitong.环形链表;

import java.util.HashSet;
import java.util.Set;

/*
给定一个链表，判断链表中是否有环。
    为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
    如果 pos 是 -1，则在该链表中没有环。
示例 1：
    输入：head = [3,2,0,-4], pos = 1
    输出：true
    解释：链表中有一个环，其尾部连接到第二个节点。
 */
public class Solution {
    /**
     * 用hash表判断
     * @param head 传入一个头结点
     * @return
     */

 public static boolean hasCycle(ListNode head){
     Set<ListNode>  hs =new HashSet<>();
     while (head != null){
         if (hs.contains(head)){
             return true ;
         }
         else{
             hs.add(head);
         }
         head =head.next;
     }
     return false;
 }

    /**
     * 快慢指针办法
     * @param head
     * @return
     */
 public static boolean hasCycle1(ListNode head){
     if(head ==null ||head.next==null){
         return false;
     }
     ListNode slow =head;
     ListNode fast =head.next;
     while (slow != fast){
         if (fast ==null ||fast.next ==null){
             return false;
         }
         slow =slow.next;
         fast =fast.next.next;
     }
     return true;
 }
 }
