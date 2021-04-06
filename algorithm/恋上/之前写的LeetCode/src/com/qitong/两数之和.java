package com.qitong;
/*
    给定一个整数数组 nums 和一个目标值 target，
    请你在该数组中找出和为目标值的那 两个 整数，
    并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。
    但是，你不能重复利用这个数组中同样的元素。
示例:
    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
 */
public class 两数之和 {
    public static  int[] getIndex(int [] arr, int tar){
        //如果不存在返回-1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]+arr[j]==tar){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException(" No two nums sum");
    }



    public static void main(String[] args) {
        int[] arr = {3, 3, 56, 7, 2, 6};

        int[] index = getIndex(arr, 5);
        for (int i : index) {
            System.out.println(i);
        }
    }
}
