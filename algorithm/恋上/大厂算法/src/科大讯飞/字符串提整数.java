package 科大讯飞;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/7/31
 */
public class 字符串提整数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();

        System.out.println(getIntFromS(s));;

    }
    private static int getIntFromS(String s){
        char[] chars = s.toCharArray();
        if (chars == null || chars.length == 0) return 0;

        int l = 0;
        boolean hasNeg =false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-') hasNeg = true;
            if (chars[i]<'0'|| chars[i] > '9' )continue;
            chars[l++] = chars[i];
        }
        Integer res = Integer.valueOf(String.valueOf(chars, 0, l));
        if (hasNeg){
            return -res;
        }
        return res;

    }
}
