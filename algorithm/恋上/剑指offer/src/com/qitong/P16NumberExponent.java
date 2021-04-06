package com.qitong;

public class P16NumberExponent {
    public static double getVal(double num,int exponent){
        if (num==0&&exponent<0){
            throw new RuntimeException("你输入的指数是错误的!!");
        }
        double res=1;
        int temp =exponent;
        if (exponent <0){
            exponent = -exponent;
        }
        if (exponent%2==0){
            for (int i = 0; i < exponent / 2; i++) {
                res =res*num;
            }
            res =res * res;
        }else{
            for (int i = 0; i < (exponent - 1) / 2; i++) {
                res =res*num;
            }
            res =res*res*num;
        }
        if (temp < 0){
            res =1/res;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println("getVal(1.1,2) = " + getVal(22, -1));
    }
}
