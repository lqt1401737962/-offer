package day17_数据类型转换等;

/*
定义类 Test4
定义 main方法
定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
定义两个int类型变量a3和a4,分别赋值12,13,判断变量是否为奇数,拼接输出结果
 */
public class Test04_基偶 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        if (a1 % 2 == 0) System.out.println("a1是偶数");
        else System.out.println("a1是奇数");
        if (a2 % 2 == 0) System.out.println("a2是偶数");
        else System.out.println("a2是奇数");
    }
}
