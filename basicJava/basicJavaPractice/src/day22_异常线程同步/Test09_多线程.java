package day22_异常线程同步;
/*
问题：
创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。

 */
public class Test09_多线程 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 101; i++) {
            if (i%2==1){
                System.out.println("主线程打印奇数:"+i);
            }
        }
    }
}
