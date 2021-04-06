package 链表;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @author Qitong!!
 * @Date 2020/6/11
 */

public class _203_移除链表元素 {
    /**
     * @Author Qitong~
     * @Description //TODO 删除链表中数值等于val的节点
     * @Date 13:20 2020/6/11
     * @Param [head, val]
     * @return 链表.ListNode
     **/
    //套路总结: 可以创建一个虚拟头结点,和一个尾巴节点
    //时间O(n) 空间O(1)
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (head  != null){
            if (head.val != val){
                tail.next = head;
                tail = head;
            }
            head = head.next;
//            if (head.val ==val){
//                head = head.next;
//            }else{
//                tail.next = head;
//                tail = head;
//                head = head.next;
//            }
        }
        tail.next =null;
        return dummyHead.next;
    }
}
