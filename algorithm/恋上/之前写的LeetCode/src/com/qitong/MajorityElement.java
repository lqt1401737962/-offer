package com.qitong;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.

 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if (nums.length ==1){
            return nums[0];
        }
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        int max=0;int count =0;
        for(int i = 0;i<nums.length;i++){
            if(hm1.containsKey(nums[i])){
                count = hm1.get(nums[i])+1;
                hm1.put(nums[i],count);
                hm2.put(count,nums[i]);
                max =Math.max(count,max);
            }else{
                hm1.put(nums[i],1);
                hm2.put(1,nums[i]);
            }

        }
        return hm2.get(max);
    }

    public static  int  majorityElement2(int[]nums){
        Arrays.sort(nums);
        return nums[nums.length/2];

    }

    public static void main(String[] args) {
        System.out.println("majorityElement = " + majorityElement2(new int[]{3,3,4}));
    }
}
