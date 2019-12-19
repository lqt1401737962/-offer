package day17_数据类型转换等;
/*
定义类 Test7
定义 main方法
定义方法printNum,在main方法中调用printNum方法
printNum方法中,定义float变量f1赋值12345.01
printNum方法中,定义float变量f2赋值12345.00
printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
printNum方法中,同时输出var1,var2的值.
 */
public class Test07_ {
    public static void main(String[] args) {
        printNum();
    }
    static void printNum(){
        float f1=12345.01f;
        float f2 =12345.00f;
        float var1=f1>=f2? 123456:(float)12456.02;
        float var2 =var1+1024;
        System.out.println(var1);
        System.out.println(var2);
    }
}
