package com.qitong;
//42 连续子数组的最大和
public class P42FindMaxSumOfSubArray {
    public static int findVal(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum<0){
                max = Math.max(max,arr[i]);
                sum = arr[i];
            }else{
                sum += arr[i];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    public static int getV(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : arr) {
            if (sum>0){
                sum += i;
            }else{
                sum = i;
            }
           max=Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr ={1,-2,3,10,-4,7,2,-5};
        int val = findVal(arr);
        System.out.println("val="+val);
        System.out.println(getV(arr));
    }
}
