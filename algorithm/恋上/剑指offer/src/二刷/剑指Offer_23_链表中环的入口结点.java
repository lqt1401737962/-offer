package 二刷;

import 二刷.common.ListNode;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 *
 * @author Qitong!!
 * @Date 2020/7/22
 */
public class 剑指Offer_23_链表中环的入口结点 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        //相遇
        while (slow != fast) {
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        //相遇后将快指针指向头结点继续!
        fast = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
