package com.qitong;

public class P10Fibonacci {

    public static int fibonacciRecursive(int n){
        if (n ==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
    }

    public static int fibonacciNoRecursive(int n){
        int[] begin ={0,1};
        if (0<=n&&n<2){
            return begin[n];
        }

        int zero =0;
        int one = 1;
        int res =0;
        for (int i = 2; i <= n; i++) {
            res =zero+one;
            zero =one;
            one =res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("fibonacciRecursive(10) = " + fibonacciRecursive(10));
        System.out.println("fibonacciNoRecursive(10) = " + fibonacciNoRecursive(10));
    }
}
