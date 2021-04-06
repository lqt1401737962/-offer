package day08_stream流练习;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
问题：
已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
    1、取出前2个元素并在控制台打印输出。
    2、取出后2个元素并在控制台打印输出。

 */
public class Test04_方法练习 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("陈玄风");
        al.add("梅超风");
        al.add("陆乘风");
        al.add("曲灵风");
        al.add("武眠风");
        al.add("冯默风");
        al.add("罗玉风");
        al.stream().limit(2).forEach(System.out::println);
        al.stream().skip(al.size() - 2).forEach(System.out::println);
    }
}
