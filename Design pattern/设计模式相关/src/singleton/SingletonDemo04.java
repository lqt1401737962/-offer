package singleton;

import java.lang.reflect.Constructor;

//静态内部类
public class SingletonDemo04 {
    private SingletonDemo04(){}

    public static class InnerClass{
        private static final SingletonDemo04 instance =new SingletonDemo04();
    }
    public static  SingletonDemo04 getInstance(){
        return InnerClass.instance;
    }
}


//反射机制
class SingletonTest04{
    public static void main(String[] args) throws Exception {
        SingletonDemo04 instance = SingletonDemo04.getInstance();

        Constructor<SingletonDemo04> constructor = SingletonDemo04.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDemo04 instance2 = constructor.newInstance();

        System.out.println(instance ==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}
