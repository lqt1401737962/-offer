package 链表;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * @author Qitong
 */
public class _206_反转链表 {

	//递归 时间O(N)  空间 O(N)
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
    }


    //遍历一遍!时间O(N) 空间 O(1)
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode newHead = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}

		return newHead;
    }

}
