package day17_数据类型转换等;
/*
定义类 Test9
定义 main方法
定义printString方法
printNum方法中,定义String 类型变量str.
printNum方法中,定义int类型变量num,赋为任意整数值.
printNum方法中,通过三元运算符,判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str
printNum方法中,输出拼接效果
 */
public class Test09_ {
    public static void main(String[] args) {
printString();
    }
    static  void printString(){
        String str;
        int num =23;
        str=(num%2==0)? "偶数":"奇数";
        System.out.println(str);
    }
}
