package day21_循环结构;

/*定义类 Test1
定义 main方法
定义变量i为0,i2为10
使用第一个while循环,当条件为i小于5 时,则进入循环
循环内,i自增,i2自增
循环内,使用if判断,当i大于等于 2 并且i2小于15 时,同时输出i和i2的值
使用第二个while循环,当条件为i2小于20 时,则进入循环
循环内,i自增,i2自增
循环内,使用if判断,当i大于8 或者i2小于等于18 时,同时输出i和i2的值

 */
public class Test01_语法练习 {
    public static void main(String[] args) {
        int i = 0, i2 = 10;
        while (i < 5) {
            i++;
            i2++;
            if (i >= 2 && i2 < 15) {
                System.out.println("i的值是:" + i);
                System.out.println("i2的值是:" + i2);
            }
        }
        while (i2 < 20) {
            i++;
            i2++;
            if (i > 8 || i2 <= 18) {
                System.out.println("i的值是:" + i);
                System.out.println("i2的值是:" + i2);
            }
        }
    }
}
