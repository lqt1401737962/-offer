package day11_函数试接口;
/*
练习一：函数式接口

    2.	在测试类中定义static void showLongTime(CurrentTimePrinter timePrinter)，
        该方法的预期行为是使用timePrinter打印系统当前毫秒值
    3.	测试showLongTime(),通过lambda表达式完成需求

 */
public class Test01_函数式接口 {
    public static void main(String[] args) {
    showLongTime(()->System.out.println(System.currentTimeMillis()));
    }
    static void showLongTime(CurrentTimePrinter timePrinter){

        timePrinter.printCurrentTime();
    }
}
