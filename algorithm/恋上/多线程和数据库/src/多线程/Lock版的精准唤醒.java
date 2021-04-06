package 多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Qitong!!
 * @Date 2020/8/18
 */
public class Lock版的精准唤醒 {
    /*
    多线程按照顺序调用A->B->C
    A打印5次 B打印10次 C打印15次
    5轮
     */
    public static void main(String[] args) {
        MyResource myResource = new MyResource();
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                myResource.print5();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                myResource.print10();
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                myResource.print15();
            }
        }, "C").start();
    }

}

//线程操作资源类
//判断干活通知()不能用if 防止虚假唤醒
//标志位
class MyResource {
    //1代表A 2代表B 3代表C
    private int num = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void print5() {
        lock.lock();
        try {
            //判断
            while (num != 1) {
                condition1.await();
            }
            //干活
            num = 2;
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print10() {
        lock.lock();
        try {
            //判断
            while (num != 2) {
                condition2.await();
            }
            //干活
            num = 3;
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();
        try {
            //判断
            while (num != 3) {
                condition3.await();
            }
            //干活
            num = 1;
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName() + "\t" + i);
            }
            //通知
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
