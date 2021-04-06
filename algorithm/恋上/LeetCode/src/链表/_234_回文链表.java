package 链表;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * @author  Qitong!!
 * @Date 2020/6/11
 */
public class _234_回文链表 {
    //时间复杂度O(N) 空间 O(1)
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next ==null) return true;
        if(head.next.next ==null) return head.val == head.next.val;

        ListNode mid = middleNode(head);
        ListNode rHead = reverseList(mid.next);
        ListNode lHead = head;
        ListNode rOldHead = rHead;
        boolean res =true;
        while(rHead != null){
            if (lHead.val != rHead.val){
                 res =false;
                 break;
            }
            rHead = rHead.next;
            lHead = lHead.next;
        }

        reverseList(rOldHead);
        return res;

    }

    /*
     * @Author Qitong~
     * @Description //TODO 翻转链表
     *                 原链表的头结点
     *                 比如原链表：1>2>3>4>null，翻转之后是：4>3>2>1>null
     * @Date 17:39 2020/6/11
     * @Param [head]
     * @return 链表.ListNode
     **/
    private ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }

    /**
     * @Author Qitong~
     * @Description //TODO 找到中间的节点返回
     * @Date 17:37 2020/6/11
     * @Param [head]
     * @return 链表.ListNode
     **/
    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow .next;
        }
        return slow;
    }

    //时间复杂度O(N) 空间 O(N)
    public static boolean isPalindrome2(ListNode head){
        Stack<ListNode> res = new Stack<>();
        ListNode cur =head;
        while(cur != null) {
            res.push(cur);
            cur =cur.next;
        }
        while(head !=null){
            ListNode node=res.pop();
            if(head.val ==node.val){
                head =head.next;
            }else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//		head.next.next.next.next = new ListNode(1);
        System.out.println(head);

        _234_回文链表 obj = new _234_回文链表();
        System.out.println(obj.isPalindrome(head));

        System.out.println(head);
    }
}
