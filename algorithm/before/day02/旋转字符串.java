package day02;

import java.util.Arrays;

//给定一个字符串（以字符数组的形式给出）和一个偏移量，根据偏移量原地旋转字符串(从左向右旋转)。
public class 旋转字符串 {
    public static void main(String[] args) {
        String string = "safisnga75834ggddng";
        String reverse = reverse(string, 7);
        System.out.println(reverse);

    }

    public static String reverse(String str, int offset) {
        char[] chars = str.toCharArray();
        char[] chars1 = new char[chars.length];
        int num = 0;
        for (int i = chars.length - offset; i <= chars.length; i++) {
            chars1[num++] = chars[i];
            if (num == offset) {
                break;
            }
        }
        for (int j = 0; j < chars.length - offset; j++) {
            chars1[num++] = chars[j];
        }
        String s = new String(chars1);
        return s;
    }
}
