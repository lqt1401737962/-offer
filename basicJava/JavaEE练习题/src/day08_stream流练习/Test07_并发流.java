package day08_stream流练习;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
问题：
请分别写出获取并发流的两种方式。
 */
public class Test07_并发流 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        Stream<Object> objectStream = al.parallelStream();
        Stream<Integer> parallel = Stream.of(100, 200, 300, 400).parallel();
        System.out.println(parallel);
    }
}
