package day21_循环结构;

/*
定义类 Test7
定义 main方法
定义boolean类型变量,bVar为false,bVar1为true
定义int类型变量,count 为 8
使用do ... while 格式,do代码块中,输出"Hello Java!"拼接count的字符串
do代码块中,使用if判断,如果count大于等于7,则bVar1赋值为false,count自减,否则count+=3.
while中,当bVar与bVar1值相等并且count小于9的时候,进入循环
 */
public class Test07_语法练习 {
    public static void main(String[] args) {
        boolean bVar = false, bVar1 = true;
        int count = 8;
        do {
            System.out.println("Hello Java!" + count);
            if (count >= 7) {
                bVar1 = false;
                count--;
            } else {
                count += 3;
            }
        } while (bVar = bVar1 && count < 9);
    }
}
