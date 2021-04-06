package day20_线程池;

import day13_继承和抽象类.A;

/*
	在下面的代码中，请分别使用Lambda的标准格式
	及省略格式调用 invokeCalc 方法，完成130和120的相减计算：
 */
public class Test10_计算器 {
    public static void main(String[] args) {
    invokeCalc(130,120,(a,b)->a-b);
    }
    private static void invokeCalc(int a, int b,Calculator cal){

        int result = cal.calc(a,b);
        System.out.println("结果是:"+result);
    }
}
