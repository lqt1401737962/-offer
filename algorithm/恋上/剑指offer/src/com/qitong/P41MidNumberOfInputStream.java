package com.qitong;

import java.util.Comparator;
import java.util.PriorityQueue;

//得到输入流中位数
public class P41MidNumberOfInputStream {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public P41MidNumberOfInputStream() {
        this.maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        this.minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
    }

    public void add(int num){
        if (maxHeap.isEmpty()){
            maxHeap.add(num);
        }else{
            if (maxHeap.peek() >num){
                maxHeap.add(num);
            }else if (minHeap.isEmpty()){
                minHeap.add(num);
            }else if (minHeap.peek() <num){
                minHeap.add(num);
            }else{
                maxHeap.add(num);
            }
        }
        heapify();
    }

    private void heapify() {
        if (maxHeap.size() == minHeap.size()+2){
            minHeap.add(maxHeap.poll());
        }
        if (minHeap.size() == maxHeap.size()+2){
            maxHeap.add(minHeap.poll());
        }
    }

    public double getRes(){
        int maxSize =maxHeap.size();
        int minSize =minHeap.size();
        double res =0;
        if ((maxSize+minSize)%2==0){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }else{

            return res = maxSize >minSize? maxHeap.peek():minHeap.peek();
        }
    }

    public static void main(String[] args) {
        P41MidNumberOfInputStream test = new P41MidNumberOfInputStream();
        test.add(1);
        test.add(2);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        System.out.println(test.getRes());
    }
}
