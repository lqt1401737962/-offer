package 二刷;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_59_II_队列的最大值 {
}

class MaxQueue {
    private Queue<Integer> queue;
    private Deque<Integer> maxQueue;

    public MaxQueue() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        return maxQueue.size() == 0 ? -1 : maxQueue.getFirst();
    }

    public void push_back(int value) {
        //先检查当最大队列不为空并且 要加入的值 大于队尾的值!
        while (maxQueue.size() != 0 && value > maxQueue.peekLast()) {
            //把队尾元素删除
            maxQueue.pollLast();
        }
        maxQueue.offer(value);
        queue.offer(value);

    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        Integer poll = queue.poll();
        if (poll.equals(maxQueue.peek())) {
            maxQueue.poll();
        }
        return poll;
    }
}
