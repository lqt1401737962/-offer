package com.qitong;
/*
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
示例 1:
    输入: "A man, a plan, a canal: Panama"
    输出: true
示例 2:
    输入: "race a car"
    输出: false
 */
public class 验证回文串 {
    public static boolean isPalindrome(String str){
        int pre =0;
        int pos =str.length()-1;
        while (pre<pos){
            while (pre<pos&&!Character.isLetterOrDigit(str.charAt(pre))) pre++;
            while (pre<pos&&!Character.isLetterOrDigit(str.charAt(pos))) pos--;
            if (Character.toUpperCase(str.charAt(pre))!=Character.toUpperCase(str.charAt(pos))){return false;}
            pre++;
            pos--;
        }
        return true;
    }
}
