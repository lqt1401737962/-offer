package day17_数据类型转换等;

/*
定义类 Test8
定义 main方法
定义printNum方法,在main方法中调用printNum方法
printNum方法中,定义int类型变量i赋值为10,j 赋值为20;
printNum方法中,将 i/5 的商 与 j的和 赋值给j
printNum方法中,定义int类型变量k,将j赋值给k.
printNum方法中,最后同时输出 i, j ,k 的值,查看结果.
 */
public class Test08 {
    public static void main(String[] args) {
        printNum();
    }

    static void printNum() {
        int i = 10, j = 20;
        j = i / 5 + j;
        int k = j;
        System.out.println("i的值:" + i);
        System.out.println("j的值:" + j);
        System.out.println("k的值:" + k);
    }
}
