package com.qitong;

import java.util.Arrays;

public class P21ArrayPartition {
    public static int[] oddEvenNumber(int[] arr){
        if (arr ==null&& arr.length <1){
            return null;
        }
        int odd =-1;
        int even =arr.length-1;
        int cur =0;
        while (odd < even){
            if (big3(arr[cur])){
                odd++;
                cur++;
            }else{
                swap(arr,cur,even--);
            }
        }
        return arr;
    }


    private static boolean isCondition(int n){
        return n%2==1;
    }

    private static  boolean big3(int n){
        return n%3==0;
    }
    private static void swap(int[] arr,int i,int j){
        int temp =arr[i];
         arr[i] =arr[j];
         arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int[] ints = oddEvenNumber(arr);

        System.out.println(Arrays.toString(ints));
    }
}
