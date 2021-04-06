package vivo;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/12
 */
public class 回文字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String s = str.substring(0,i)+str.substring(i+1,length);
            if (isPalindrome(str)) System.out.println(s);
            break;
        }

    }
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
