package 二刷;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/6
 */
public class 剑指Offer_40_最小的k个数 {
    //使用最大堆完成 ! 时间 O(Nlogk) 空间 O(k)
    public static int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k) queue.poll();
        }

        int[] res = new int[k];
        int cur = 0;
        while (!queue.isEmpty()) {
            res[cur++] = queue.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 45, 61, 1, 2};
        getLeastNumbers(arr, 3);
    }
}
