package day05_Math类;

import java.util.Random;

/*
生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题
 */
public class Test05_随机数 {
    public static void main(String[] args) {
        Random random = new Random();
        double d = random.nextDouble() * 100;
        System.out.println(d);
        String s = d + "";
        String substring = s.substring(0, 5);
        System.out.println(substring);

    }
}
