package leetcode;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;

/*
删除链表中等于给定值 val 的所有节点。
示例:
    输入: 1->2->6->3->4->5->6, val = 6
    输出: 1->2->3->4->5
 */
public class 移除链表元素 {
    /**
     * 借助 集合完成,很容易想的,但时间,空间复杂度较高
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){return null;}
        ArrayList<Integer> al =new ArrayList<Integer>();
        while(head!=null){
            if(head.val !=val){
                al.add(head.val);
                head =head.next;
            }
        }

        ListNode node= new ListNode(al.get(0));
        for(int i=1;i<al.size();i++){
            node.next =new ListNode(al.get(i));
        }
        return head;
    }


    public static  ListNode removeElements2(ListNode head ,int val){
        while (head.next!= null&&head.val==val ) {
            head = head.next;
        }
        if (head ==null){
            return head;
        }
        ListNode pre =head;
        while (pre.next!=null){
            if (pre.next.val ==val){
                pre.next =pre.next.next;
            }else{
                pre =pre.next;
            }
        }
        return head;
    }
}
