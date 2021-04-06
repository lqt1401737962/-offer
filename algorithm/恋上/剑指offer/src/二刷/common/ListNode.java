package 二刷.common;

/**
 * @author 14017
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) {
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
