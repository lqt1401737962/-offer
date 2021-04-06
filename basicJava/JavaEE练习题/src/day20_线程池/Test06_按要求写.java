package day20_线程池;

import day17_数据类型转换等.Test06;

//请在指定位置插入代码实现打印输出1-99。
public class Test06_按要求写 {
    public int start = 1;
    public int end = 99;

    public static void main(String[] args) {
        Test06_按要求写 test06_按要求写 = new Test06_按要求写();
        test06_按要求写.method();
    }

    public void method() {
//请在此处插入代码，实现功能
        Runnable a = () -> {
            for (int i = start; i < end + 1; i++) {
                System.out.print(i + " ");
            }
        };
        Thread t = new Thread(a);
        t.start();
    }
}
