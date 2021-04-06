package 二刷;

import 二刷.common.ListNode;

/**
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/2
 */
public class 剑指Offer_25_合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummyHead = new ListNode(0);
        ListNode dummyTail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                dummyTail.next = l2;
                l2 = l2.next;
            } else {
                dummyTail.next = l1;
                l1 = l1.next;
            }
            dummyTail = dummyTail.next;
        }
        if (l1 != null) {
            dummyTail.next = l1;
        }
        if (l2 != null) {
            dummyTail.next = l2;
        }
        return dummyHead.next;
    }
}
