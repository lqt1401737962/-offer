package 多线程;

/**
 * @author Qitong!!
 * @Date 2020/8/18
 */
public class 生产者和消费者老版 {
    public static void main(String[] args) {
        resource resource = new resource();
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                try {
                    resource.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()->{
            for (int i = 1; i <= 5; i++) {
                try {
                    resource.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}
/*
   线程操作资源类
   判断/干活/通知  (不能用if)
   标志位!
 */
class resource{
    private int num = 0;

    public synchronized void increment() throws InterruptedException {
        //判断
        while (num !=0){
            this.wait();
        }
        //干活
        num++;
        System.out.println(Thread.currentThread().getName() +"\t"+num);
        //唤醒
        this.notifyAll();
    }
    public synchronized void decrement() throws InterruptedException {
        //判断
        while (num ==0){
            this.wait();
        }
        //干活
        num--;
        System.out.println(Thread.currentThread().getName() +"\t"+num);
        //唤醒
        this.notifyAll();
    }
}
