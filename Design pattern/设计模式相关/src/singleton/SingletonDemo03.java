package singleton;

public class SingletonDemo03 {
    //DCl懒汉式
    private SingletonDemo03 (){}

    //加关键字volatile 保证原子性
    private volatile static SingletonDemo03 instance;

    public static SingletonDemo03 getInstance(){
        if (instance ==null){
            synchronized (SingletonDemo03.class){
                if (instance ==null){
                    instance =new SingletonDemo03();
                }
            }
        }
        return instance;
    }
}
class SingletonTest03{
    public static void main(String[] args) {
        SingletonDemo03 instance = SingletonDemo03.getInstance();
        SingletonDemo03 instance2 = SingletonDemo03.getInstance();

        System.out.println(instance ==instance2);

    }
}


