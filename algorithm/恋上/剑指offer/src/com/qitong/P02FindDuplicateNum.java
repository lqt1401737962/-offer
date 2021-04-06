package com.qitong;

//找出数组中重复的数字
public class P02FindDuplicateNum {

    public static boolean findDuplicateNum(int[] num,int length,int[] dup){

        if (num==null ||num.length < 2){
            return false;
        }

        for (int i = 0; i < num.length; i++) {
            //当对号入座时,i+
            while (num[i] != i){
                if (num[i] == num[num[i]]){
                    dup[0] = num[i];
                    return true;
                }
                swap(num,i,num[i]);
            }
        }
        return false;
    }
    public static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }



    public static void main(String[] args) {
        int[] nums ={2,3,1,0,2,5,3};
        int[] dup= new int[1];
        System.out.println("findDuplicateNum = " + findDuplicateNum(nums, nums.length, dup));
        System.out.println(dup[0]);

    }
}
