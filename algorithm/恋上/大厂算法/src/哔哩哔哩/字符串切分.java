package 哔哩哔哩;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/8/12
 */
public class 字符串切分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        splitAndPrint(s);
    }
    public static void splitAndPrint(String s){
        if (s.length() < 1) {
         System.out.println(0);
         return ;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (strings[i].charAt(0) != ' ' && strings[i].charAt(1)==':'){
                    count++;
                    sb.append(strings[i].charAt(0)).append(strings[i].charAt(2)).append(" ");
                }
            }
        }
        System.out.println(count);
        String[] s1 = sb.toString().split(" ");
        for (String s2 : s1) {
            System.out.println(s2.charAt(0)+" "+s2.charAt(1));
        }
    }
}
