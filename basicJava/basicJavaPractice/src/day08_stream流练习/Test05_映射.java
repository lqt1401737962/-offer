package day08_stream流练习;

import java.util.stream.Stream;

/*
问题：
    有如下整数
    使用Stream取元素绝对值并打印

 */
public class Test05_映射 {
    public static void main(String[] args) {
        Stream<Integer> is = Stream.of(1, -2, -3, 4, -5);
        is.map(Math::abs).forEach(System.out::println);
    }
}
