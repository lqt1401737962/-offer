package com.qitong;
/*
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
示例 1:
    输入: "Let's take LeetCode contest"
    输出: "s'teL ekat edoCteeL tsetnoc" 
    注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

 */
public class 反转字符串中的单词 {
    public static String reverseWord(String s){
        String[] strs = s.split(" ");
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            res.append(reverse(strs[i])+" ");

        }
        return res.toString().trim();
    }

    public static String reverseWord2(String str){
        String[] strings = str.split(" ");
        StringBuffer res = new StringBuffer();
        for (String string : strings) {
            res.append(new StringBuffer(string).reverse().toString()+" ");
        }
        return res.toString().trim();
    }
    public  static String reverse(String s){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.insert(0,s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("reverseWord = " + reverseWord("nihaoma apple bnana pear hha"));
        System.out.println(reverseWord2("abcd efg hij lmn opq rst uvw xyz"));
    }
}
