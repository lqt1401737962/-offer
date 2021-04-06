package 二刷;

import 二刷.common.ListNode;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/2
 */
public class 剑指Offer_22_链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        //找到第k个节点
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            head = head.next;
            cur = cur.next;
        }
        return head;
    }
}
