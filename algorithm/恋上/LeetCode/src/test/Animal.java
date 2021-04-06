package test;

/**
 * description
 *
 * @author qiton 2021/03/04 18:55
 */
public class Animal implements PersonMethod{
    @Override
    public void see() {
        System.out.println("我是see的方法重写后的" );
    }

    @Override
    public void run() {
        System.out.println("你是我的急支糖浆");
    }
}
