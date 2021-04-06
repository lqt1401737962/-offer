package com.qitong;

public class 二进制求和 {
    public static String addBinary(String s1 ,String s2){
        StringBuffer sb = new StringBuffer();
        int carry =0;
        for (int i=s1.length()-1,j=s2.length()-1;i>=0 ||j >=0; i--,j--){
            int sum =carry;
            sum += (i >=0? s1.charAt(i) -'0':0);
            sum += (j >=0? s2.charAt(j) -'0':0);
            sb.append(sum%2);
            carry =sum/2;
        }
        sb.append(carry ==1? carry: "");
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 ="10111";
        String s2 ="1111";
        System.out.println("addBinary(s1,s2) = " + addBinary(s1, s2));
    }
}
