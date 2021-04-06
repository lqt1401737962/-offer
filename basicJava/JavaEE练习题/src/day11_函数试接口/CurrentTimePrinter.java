package day11_函数试接口;

/* 1.	定义一个函数式接口CurrentTimePrinter,其中抽象方法void printCurrentTime()，
         使用注解@FunctionalInterface*/
@FunctionalInterface
public interface CurrentTimePrinter {

    void printCurrentTime();
}
