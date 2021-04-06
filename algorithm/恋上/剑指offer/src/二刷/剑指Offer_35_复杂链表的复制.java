package 二刷;

import 二刷.common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/5
 */
public class 剑指Offer_35_复杂链表的复制 {
    //利用 HashMap 时间 O(N) 空间 O(N)
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> hashMap = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            hashMap.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }

    //进阶解法
    public Node copyRandomList2(Node head) {
        if (head == null) return null;

        //复制链表结点
        Node cur = head;
        while (cur != null) {
            Node copyNode = new Node(cur.val);
            copyNode.next = cur.next;
            cur.next = copyNode;
            cur = copyNode.next;
        }

        //建立 Random 链接
        cur = head;
        while (cur != null) {
            Node copy = cur.next;
            if (cur.random != null) {
                copy.random = cur.random.next;
            }
            cur = copy.next;
        }

        //拆分!!
        cur = head;
        Node newHead = cur.next;
        while (cur.next != null) {
            Node nextNode = cur.next;
            cur.next = nextNode.next;
            cur = nextNode;
        }
        return newHead;
    }
}
