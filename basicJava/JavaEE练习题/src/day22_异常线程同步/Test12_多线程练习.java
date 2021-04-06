package day22_异常线程同步;

public class Test12_多线程练习 {
    public static void main(String[] args) {
        System.out.println("主线程名称:" + Thread.currentThread().getName());
        MyThread mt = new MyThread();
        mt.start();
        SubThread st = new SubThread();
        Thread t = new Thread(st);
        t.start();
    }
}
