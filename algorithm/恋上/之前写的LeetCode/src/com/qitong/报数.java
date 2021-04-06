package com.qitong;
/*
报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221

    1 被读作  "one 1"  ("一个一") , 即 11。
    11 被读作 "two 1s" ("两个一"）, 即 21。
    21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

 */
public class 报数 {
    public static String countAndSay(int n){
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuffer sb =new StringBuffer();
            char pre = str.charAt(0);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                if (pre == str.charAt(j)){
                    count ++;
                }
                else{
                    sb.append(count).append(pre);
                    pre = str.charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(pre);
            str = sb.toString();
        }

        return str;
    }



    public static void main(String[] args) {
        System.out.println("countAndSay(7) = " + countAndSay(50));
    }
}
