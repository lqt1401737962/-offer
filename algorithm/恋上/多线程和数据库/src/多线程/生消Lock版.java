package 多线程;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Qitong!!
 * @Date 2020/8/18
 */
public class 生消Lock版 {
    public static void main(String[] args) {
        resource1 resource = new resource1();
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                resource.increment();
            }
        },"A").start();
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                resource.decrement();
            }
        },"B").start();
    }
}
//线程操作资源类
//判断/干活/通知
class resource1 {
    private int num =0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment(){
        lock.lock();
        try {
            //判断
            while (num != 0){
                condition.await();
            }
            //干活
            num++;
            System.out.println(Thread.currentThread().getName()+"\t" +num);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void decrement(){
        lock.lock();
        try {
            //判断
            while (num == 0){
                condition.await();
            }
            //干活
            num--;
            System.out.println(Thread.currentThread().getName()+"\t" +num);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
