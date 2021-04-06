package 链表;

/**
 * @author 14017
 */
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(""+val);
		while (next!=null){
			sb.append("-->"+next.val);
			next = next.next;
		}
		return sb.toString();
	}
}
