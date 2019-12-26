package leetcode;

import java.util.HashSet;

public class IntersectionOfTwoLinkList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet hs = new HashSet();
        while(headA != null){
            hs.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(hs.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

}
