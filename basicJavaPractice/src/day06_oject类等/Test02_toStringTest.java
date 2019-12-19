package day06_oject类等;
//二、不运行代码，直接说出打印结果，并解释原因。
public class Test02_toStringTest {
    static int i = 1;
    public static void main(String args[]){
        System.out.println("love " + new Test02_toStringTest());//love java
        Test02_toStringTest a = new Test02_toStringTest();
        a.i++;
        System.out.println("me " + a.i);//me 2
    }
    public String toString(){
        System.out.print("I ");//I
        return "java ";
    }
}/*
运行结果：I love java    me 2
原因：当执行语句时 首先会加载静态代码块然后是主方法main 由于第一条是输出语句
    会自动调用toString 方法,因为重写了toString方法所以会先打印toString方法中执行语句
    I love java;*/

