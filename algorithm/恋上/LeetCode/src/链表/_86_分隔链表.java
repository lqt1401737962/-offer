package 链表;

/**
 * https://leetcode-cn.com/problems/partition-list/
 * @author Qitong!!
 * @Date 2020/6/11
 */
public class _86_分隔链表 {
    /**
     * @Author Qitong~
     * @Description //TODO 给定一个链表和一个特定值 x，对链表进行分隔，
     *                  使得所有小于 x 的节点都在大于或等于 x 的节点之前。
     *                  你应当保留两个分区中每个节点的初始相对位置。
     * @Date 17:18 2020/6/11
     * @Param [head, x]
     * @return 链表.ListNode
     **/
    public ListNode partition(ListNode head, int x) {
        if ( head ==null) return null;

        ListNode less = new ListNode(0),l =less;
        ListNode more = new ListNode(0), r = more;
        ListNode cur = head;
        while (cur != null){
            if (cur.val < x){
                l.next = cur;
                l = cur;
            }else{
                r.next = cur;
                r = cur;
            }
            cur = cur.next;
        }
        r.next = null;
        l.next = more.next;
        return less.next;
    }

}
