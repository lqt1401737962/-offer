package 多线程;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Qitong!!
 * @Date 2020/8/31
 */
public class 整数加加问题 {
    private static AtomicInteger i =new AtomicInteger(0);
    public static void add(){
        i.getAndIncrement();
    }
    public static void main(String[] args) {

        final  Integer num = null;
        for (int i = 1; i <= 10; i++) {
            new Thread(() ->{
                for (int j = 0; j < 1e5; j++) {
                    add();
                }
            }, String.valueOf(i)).start();
        }
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(1e5);
        System.out.println(i);

    }
}
