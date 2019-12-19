package day21_循环结构;
/*
定义类 Test3
定义 main方法
使用for循环,初始化变量r为10,当r>0时,进入循环
for循环内,定义变量c,赋值为r
for循环内,使用while循环,当c>=0时,输出c,再将c减2赋值给c
for循环内,while循环外,r除以c赋值给r
 */
public class Test03_语法练习 {
    public static void main(String[] args) {
        for (int r =10;r>0;){
            int c =r;
            while (c>=0){
                System.out.println("c的值:"+c);
                c-=2;
            }
            r /=c;
        }
    }
}
