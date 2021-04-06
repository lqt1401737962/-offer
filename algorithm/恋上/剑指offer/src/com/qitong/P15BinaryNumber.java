package com.qitong;

public class P15BinaryNumber {
    public static int countOneTimes(int num){
        int count =0;
        while (num!=0){
            count++;
            num =(num-1)&num;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOneTimes(15));
    }
}
