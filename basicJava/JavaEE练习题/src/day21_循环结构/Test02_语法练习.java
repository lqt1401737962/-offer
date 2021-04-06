package day21_循环结构;

/*
定义类 Test2
定义 main方法
定义变量 discount为1, totalPrice为550
判断当totalPrice >=500 ,discount赋值为0.5
判断当totalPrice >=400 且<500时,discount赋值为0.6
判断当totalPrice >=300 且<400时,discount赋值为0.7
判断当totalPrice >=200 且<300时,discount赋值为0.8
输出totalPrice.
输出totalPrice 与 discount 的积
 */
public class Test02_语法练习 {
    public static void main(String[] args) {
        double discount = 1, totalPrice = 550;
        if (totalPrice >= 500) {
            discount = 0.5;
        }
        System.out.println(totalPrice + "总钱数");
        System.out.println("乘机:" + totalPrice * discount);
    }
}
