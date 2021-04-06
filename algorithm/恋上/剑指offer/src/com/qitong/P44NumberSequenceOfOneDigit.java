package com.qitong;

public class P44NumberSequenceOfOneDigit {
    public static int getDigit(int num,int index){
        String string = String.valueOf(num);
        char c = string.charAt(index);
        if (num<0){
            return Integer.valueOf(string.charAt(index+1)-'0');
        }else{
            return Integer.valueOf(c-'0');
        }

    }

    public static void main(String[] args) {
        System.out.println("getDigit(123456,2) = " + getDigit(123456, 2));
        System.out.println("getDigit = " + getDigit(-123456, 2));
    }
}
