package 链表;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @author Qitong!!
 * @Date 2020/6/11
 */
public class  _160_相交链表 {
    /**
     * @Author Qitong~
     * @Description //TODO 如果两个链表没有交点，返回 null.
     *                 在返回结果后，两个链表仍须保持原有的结构。
     *                 可假定整个链表结构中没有循环。
     *                 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
     * @Date 17:14 2020/6/11
     * @Param [headA, headB]
     * @return 链表.ListNode
     **/
    //时间O(n+m) 空间O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode curA = headA, curB = headB;
        while (curA != curB) {
            curA = (curA == null) ? headB : curA.next;
            curB = (curB == null) ? headA : curB.next;
        }
        return curA;
    }

    //利用HashMap来做! 空间复杂度O(N)
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

        HashSet<ListNode> hm = new HashSet<>();
        while (headA != null){
            hm.add(headA);
            headA = headA.next;
        }
        while (headB != null){
            if (hm.contains(headB)){
                return headB;
            };
            headB = headB.next;
        }
        return null;
    }
}
