package com.qitong;

public class x的平方根 {
    public static void main(String[] args) {
        System.out.println("sqrt(16) = " + sqrt(2147395599));
    }

    public static int  sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        while (left < right) {
            int mid = (right + left + 1) >>> 1;
            long sqart = (long)mid * mid;
            if (sqart > x) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return (int)(left);
    }

}
