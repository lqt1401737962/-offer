package day17_数据类型转换等;

/*
编写步骤：
 */
public class Test02_按要求写 {
    //定义类 Test2
    //    定义 main方法
    public static void main(String[] args) {
        //定义 int类型变量i1 和 long类型变量l1
        //    定义变量add,保存i1和l1的和,并输出.
        int i1 = 100;
        long l1 = 200L;
        long add = i1 + l1;
        System.out.println(add);
        // 定义 long类型变量l2 和 float类型变量f2
        //    定义变量add2,保存l2和f2的和,并输出.
        long l2 = 100;
        float f2 = 200.3f;
        float add2 = l2 + f2;
        System.out.println(add2);
        //定义 int类型变量i3 和 double类型变量d3
        //    定义变量add3,保存i3和d3的和,并输出.
        int i3 = 100;
        double d3 = 200;
        double add3 = i3 + d3;
        System.out.println(add3);
//定义 float类型变量f4 和 double类型变量d4
//    定义变量add4,保存f4和d4的和,并输出.
        float f4 = 12.3f;
        double d4 = 243532.54;
        double add4 = f4 + d4;
        System.out.println(add4);
    }
}
