package day02;

import java.util.ArrayList;

/*
    给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
        如果这个数被3整除，打印fizz.
        如果这个数被5整除，打印buzz.
        如果这个数能同时被3和5整除，打印fizz buzz.
        如果这个数既不能被 3 整除也不能被 5 整除，打印数字本身。
 */
public class fizz和buzz数 {
    public static void main(String[] args) {
        System.out.println(print(55));
        ;
    }

    public static ArrayList<String> print(int n) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                strings.add("是buzz &fizz");
            } else if (i % 3 == 0) {
                strings.add("是fizz");
            } else if (i % 5 == 0) {
                strings.add("是buzz");
            } else {
                strings.add(String.valueOf(i));
            }

        }
        return strings;
    }
}
