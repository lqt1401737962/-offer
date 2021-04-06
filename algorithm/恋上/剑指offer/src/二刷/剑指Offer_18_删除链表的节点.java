package 二刷;

import 二刷.common.ListNode;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/1
 */
public class 剑指Offer_18_删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        //如果删除的结点 为 头结点
        if (head.val == val) return head.next;
        //cur记录当前的结点 pre 为当前结点的前一个结点
        ListNode pre = head, cur = head.next;
        while (cur != null) {
            //命中!!
            if (cur.val == val) pre.next = cur.next;
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}
