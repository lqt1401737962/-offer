package leetcode;

import java.util.ArrayList;

/*
删除链表中等于给定值 val 的所有节点。
示例:
    输入: 1->2->6->3->4->5->6, val = 6
    输出: 1->2->3->4->5
 */
public class 移除链表元素 {
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
}
