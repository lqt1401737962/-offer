package test;

/**
 * Java8之后接口的默认实现方法 default
 *
 * @author qiton 2021/03/25 16:11
 */
public interface PersonMethod {
    int a = 0;
    default void see(){
        System.out.println("看一看");
    }
    
    default void eat(String food){
        System.out.println("今天吃的是:"+food);
    }
    
    void run();
    
    static void staticMe(){
        System.out.println("我是静态方法的测试");
    }
    
}
