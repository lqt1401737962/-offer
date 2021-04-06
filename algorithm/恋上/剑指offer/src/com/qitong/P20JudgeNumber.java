package com.qitong;


public class P20JudgeNumber {
    public static boolean judgeNumber(String str){
        if (str==null || str.length()<1){
            return false;
        }

        return str.matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }

    public static void main(String[] args) {

        String[] strings = {"+100", "5e2", "-123", "3.1416", "-1E-16",
                "12e", "1a3.14", "1.2.3", "+-5", "12e+4.3","" };
        for (String str : strings) {
            System.out.println(str + " " + judgeNumber(str));
        }
        String str ="";
        System.out.println(str.length());
    }
}
