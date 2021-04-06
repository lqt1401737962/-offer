package 链表;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * @author Qitong!!
 * @Date 2020/6/25
 */
public class _142_环形链表II {

    //找到相交链表的 相交结点!!
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next==null ) return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast) {
            if (fast.next == null || fast.next.next== null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        fast = head;

        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }



}
