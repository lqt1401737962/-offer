package day11_函数试接口;

/*

练习三：静态方法引用
    1.	定义一个函数式接口NumberToString,其中抽象方法String convert(int num)，
        使用注解@FunctionalInterface
    2.	在测试类中定义static void decToHex(int num ,NumberToString nts),
        该方法的预期行为是使用nts将一个十进制整数转换成十六进制表示的字符串，tips:已知该行为与Integer类中的toHexString方法一致
    3.	测试decToHex (),使用方法引用完成需求

 */
public class Test03_静态方法的引用 {
    public static void main(String[] args) {
        decToHex(333, Integer::toHexString);
    }

    static void decToHex(int num, NumberToString nts) {
        String convert = nts.convert(num);
        System.out.println(convert);
    }
}
