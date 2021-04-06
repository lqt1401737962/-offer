package day09_常量变量;

/*
    定义类 Test4
    定义 main方法
    定义2个 byte类型变量,分别赋byte类型范围内最大值和最小值,并输出在控制台.
    定义2个 short类型变量,分别赋short类型范围内的值,并输出在控制台.
    定义2个 int类型变量,分别赋int类型范围内的值,并输出在控制台.
    定义2个 long类型变量,分别赋超过int类型范围的值,并输出在控制台.
 */
public class Test04_写写 {
    public static void main(String[] args) {
        byte b1 = 127;
        byte b2 = -128;
        short s1 = 32767;
        short s2 = -32768;
        int i1 = 2147483647;
        int i2 = -2147483648;
        long l1 = -2147483649L;
        long l2 = 2147483648L;
        System.out.println(b1 + "" + b2);
        System.out.println(s1 + " " + s2);
        System.out.println(i1 + " " + i2);
        System.out.println(l1 + " " + l2);

    }
}
