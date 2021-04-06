package 二刷;

import 二刷.common.ListNode;

/**
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/7
 */
public class 剑指Offer_52_两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode curA = headA, curB = headB;
        while (headA != headB) {
            headA = curA == null ? headB : curA.next;
            headB = curB == null ? headA : curB.next;
        }
        return curA;
    }
}
