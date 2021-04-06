package 二刷;

import 二刷.common.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_06_从尾到头打印链表 {
    public int[] reversePrint3(ListNode head) {
        //记录链表的节点数量!
        int count = 0;
        ListNode n = head;
        while (n != null) {
            count = count + 1;
            n = n.next;
        }
        int[] result = new int[count];
        while (head != null) {
            result[--count] = head.val;
            head = head.next;
        }
        return result;
    }

    //利用 栈来  天然的逆序
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.add(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            res[i++] = stack.pop();

        }
        return res;
    }

    private ArrayList<Integer> res;

    //递归!!!
    public ArrayList<Integer> reversePrint2(ListNode head) {
        res = new ArrayList<>();
        process(head);
        return res;
    }

    private void process(ListNode head) {
        if (head == null) return;
        process(head.next);
        res.add(head.val);
    }

}
