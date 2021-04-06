package day22_异常线程同步;

/*
	第二种方式：实现Runnable接口
1.定义一个子任务类，实现Runnable接口；
2.在子任务类中重写run方法，在run方法中打印子线程的名称；
3.定义一个测试类；
4.在main方法中打印主线程的名称；
5.在main方法中创建一个子任务对象；
6.在main方法中创建一个Thread类的对象，并把子任务对象传递给Thread类的构造方法；
7.调用Thread类对象的start方法开启子线程；

 */
public class SubThread implements Runnable {

    @Override
    public void run() {
        System.out.println("SubThread:" + Thread.currentThread().getName());
    }
}
