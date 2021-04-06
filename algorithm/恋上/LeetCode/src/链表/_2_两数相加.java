package 链表;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/submissions/
 * @author Qitong!!
 * @Date 2020/6/11
 */
public class _2_两数相加 {


/**
 * @Author Qitong~
 * @Description //TODO 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *                  输出：7 -> 0 -> 8
 *                  原因：342 + 465 = 807
 * @Date 16:45 2020/6/11
 * @Param [l1, l2]
 * @return 链表.ListNode
 **/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        //创建虚拟头结点!!和 last指向 最后一个节点
        ListNode dummyHead = new ListNode(0);
        ListNode last = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null){
            int v1 = 0;
            if (l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }
            int v2 = 0;
            if (l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }
            //相加 有 3部分 链表1,2和进位
            int sum = v1 +v2 +carry;
            int v = sum %10 ;
            carry = sum /10;
            last = last.next = new ListNode(v);
        }
        //最后检查进位!!!!
        if (carry >0){
            last.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
