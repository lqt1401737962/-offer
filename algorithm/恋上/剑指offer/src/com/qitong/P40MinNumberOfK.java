package com.qitong;

import java.util.*;

//最小的k个数
public class P40MinNumberOfK {
    public static ArrayList<Integer> getMinK(int[] arr ,int k){
        ArrayList<Integer> res = new ArrayList<>();

        if (arr==null|| arr.length<k){
            return res;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i : arr) {
            minHeap.add(i);
        }
        for (int i = 0; i < k; i++) {
            res.add(minHeap.poll());
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,324,12,3,4,5,2,3,-1,645,123,436,-33,5,-222};
        ArrayList<Integer> minK = getMinK(arr, 3);
        for (Integer integer : minK) {
            System.out.println(integer);
        }
    }
}
