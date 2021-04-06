package day17_数据类型转换等;
/*
定义类 Test6
定义 main方法
定义方法printNum,在main方法中调用printNum方法
printNum方法中,定义int变量a赋值为9,b也赋值为9
printNum方法中,定义int变量num赋值为++a.
printNum方法中,定义boolean变量bo,使用三元运算符赋值,当num>=10,赋值为true,否则为false,打印bo的值
printNum方法中,定义int变量num2赋值为b++.
printNum方法中,定义boolean变量bo2,使用三元运算符赋值,当num2>=10,赋值为true,否则为false.打印bo2的值
 */
public class Test06 {
    public static void main(String[] args) {
        printNum();
    }
    public static  void printNum(){
        int a=9,b=9;
        int num =++a;
        boolean bo =num>=10? true:false;
        System.out.println(bo);
        int num2=b++;
        boolean bo2 =num2>=10? true :false;
        System.out.println(bo2);
    }
}
