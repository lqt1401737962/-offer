package com.qitong;

public class 反转字符串 {
    public void reverseCharArray(String s){
        if (s==null || s.length()<2){
            return ;
        }
        char[] chars = s.toCharArray();
        int start =-1;
        int end =chars.length;
        while (++start < --end){
            swap(chars,start,end);
        }
    }
    public void swap(char[] chars,int start,int end){
        char temp = chars[start];
        chars[start] =chars[end];
        chars[end] =temp;
    }
}
