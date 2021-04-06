package 二刷;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/6
 */
public class 剑指Offer_41_数据流中的中位数 {
}

class MedianFinder {
    //用两个 堆 来!
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    //initialize your data structure here.

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((x, y) -> y - x);
        minHeap = new PriorityQueue<>();
    }

/*    public void addNum(int num) {
        if (minHeap.size() != maxHeap.size()) {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        } else {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
    }
    public double findMedian() {
        return maxHeap.size() != minHeap.size()? maxHeap.peek(): (maxHeap.peek()+minHeap.peek())/2.0;
    }*/

    public void addNum(int num) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(num);
        } else {
            if (maxHeap.peek() >= num) {
                maxHeap.add(num);
            } else if (minHeap.isEmpty()) {
                minHeap.add(num);
            } else if (minHeap.peek() < num) {
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }
        }
        heapify();
    }

    private void heapify() {
        if (maxHeap.size() == minHeap.size() + 2) {
            minHeap.offer(maxHeap.poll());
        }
        if (minHeap.size() == maxHeap.size() + 2) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        int maxS = maxHeap.size(), minS = minHeap.size();
        if (((maxS + minS) & 1) == 0) return (minHeap.peek() + maxHeap.peek()) / 2.0;
        return maxS > minS ? maxHeap.peek() : minHeap.peek();
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
