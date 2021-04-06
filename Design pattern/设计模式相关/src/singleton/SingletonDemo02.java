package singleton;

public class SingletonDemo02 {
    //懒汉式
    private SingletonDemo02(){}

    //类初始化时不立即加载对象
    private static SingletonDemo02 instance;

    public static synchronized SingletonDemo02 getInstance(){
        if (instance ==null){
            instance =new SingletonDemo02();
        }
        return instance;
    }
}
class SingletonTest02{
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance2 = SingletonDemo02.getInstance();

        System.out.println(instance ==instance2);

    }
}

