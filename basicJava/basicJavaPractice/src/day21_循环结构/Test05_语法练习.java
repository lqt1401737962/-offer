package day21_循环结构;
/*
定义类 Test5
定义 main方法
定义变量jj为20,a为0,b为0
使用for循环,初始化值ii为0,当ii<jj 时进入循环,步进表达式为ii+=2,jj自减
循环内,使用if判断ii被3整除,ii赋值给a,并输出ii拼接"Hello"
不被3整除,ii赋值给b,并输出ii拼接"World"
循环外,按照格式,打印a与b的乘积
 */
public class Test05_语法练习 {
    public static void main(String[] args) {
        int j= 20,a=0,b=0;
        for (int i=0;i<j;i+=2,j--){
            if (i%3==0){
                a=i;
                System.out.println(i+"Hello");
            }
            else{
                b=i;
                System.out.println(i+"Word");
            }
        }
        System.out.println("a和b的乘积"+a*b);
    }
}
