package day20_线程池;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("我要找一个老师" );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("老师来了"+Thread.currentThread().getName());
        System.out.println("老师叫我java,教完我就走了");
    }
}
