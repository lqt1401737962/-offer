package day22_异常线程同步;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("子线程的名称:" + MyThread.currentThread().getName());
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("z子线程打印偶数:" + i);
            }
        }

    }
}
