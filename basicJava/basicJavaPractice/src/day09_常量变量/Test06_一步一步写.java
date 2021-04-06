package day09_常量变量;
/*
    定义类 Test7
    定义 main方法
    定义两个整数变量a，b并赋值
    控制台输出变量a，b互换前的值
    定义一个第三方变量temp，不赋值
    利用第三方变量temp使a，b的值互换
    控制台输出变量a，b互换后的值
 */
public class Test06_一步一步写 {
    public static void main(String[] args) {
        int a =8;
        int b =9;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        int temp ;
        temp =a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
