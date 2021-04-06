package day20_线程池;

public class Test07_线程池 implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Test07_线程池());
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
    }
}
