package com.qitong;

import java.util.LinkedList;
import java.util.Queue;

public class P09_2TwoQueueToStack {
    private Queue<Integer> queue;
    private Queue<Integer> help;

    public P09_2TwoQueueToStack() {
        queue = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }

    public void push(int val) {
        queue.offer(val);
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("栈里五元素!!");
        }

        while (queue.size() > 1) {
            help.offer(queue.poll());
        }
        int res = queue.poll();
        swap();
        return res;
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("栈里没有元素可以看 !1");
        }
        int res = 0;
        while (!queue.isEmpty()) {
            res = queue.poll();
            help.offer(res);
        }
        swap();
        return res;
    }

    private void swap() {
        Queue<Integer> temp = queue;
        queue = help;
        help = temp;
    }
}
