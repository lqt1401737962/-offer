package 链表;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author Qitong
 *
 */
public class _237_删除链表中的节点 {

	//时间 O(1) 空间 O(1)
	public void deleteNode(ListNode node) {

		node.val = node.next.val;
		node.next = node.next.next;
    }
}
