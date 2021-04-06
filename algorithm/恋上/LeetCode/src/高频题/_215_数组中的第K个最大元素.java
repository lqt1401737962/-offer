package 高频题;

import java.awt.*;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 * @author Qitong!!
 * @Date 2020/6/29
 */
public class _215_数组中的第K个最大元素 {
    //调用系统自带的排序算法 时间O(nlogn) 空间 O(logn)为递归调用的深度
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length -k];
    }
    //用 小根堆
    public int findKthLargest2(int[] nums, int k) {
        //利用小根堆 如果要加如的元素>
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);
        for (int num : nums) {
            if (heap.size()<k){
                heap.offer(num);
            } else if (heap.size() == k && heap.peek() <num){
                heap.poll();
                heap.offer(num);
            }
        }
        return heap.peek();
    }



}
