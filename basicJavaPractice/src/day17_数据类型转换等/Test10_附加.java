package day17_数据类型转换等;

import com.sun.source.doctree.SummaryTree;

/*
定义类 Test10
定义 main方法




定义remain方法,打印两个变量的余数
main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法
 */
public class Test10_附加 {
    public static void main(String[] args) {
        System.out.println(sum(23,44));;
        System.out.println(sub(88,23));;
        System.out.println(mul(4,5));;
        System.out.println(div(21,3));;
        System.out.println(remain(432,8));;

    }
    //定义add方法,打印两个变量的和
    static int sum(int a,int b){
        return a +b;
    }
//定义sub方法,打印两个变量的差
    static int sub(int a ,int b){
        return  a-b;
    }
    //定义mul方法,打印两个变量的积
    static int  mul(int a ,int b){
        return a*b;
    }
    //定义div方法,打印两个变量的商
    static int div(int a ,int b){
        return  a/b;
    }
    //定义remain方法,打印两个变量的余数
    static int remain(int a ,int b){
        return a%b;
    }
}
