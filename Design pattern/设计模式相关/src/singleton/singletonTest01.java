package singleton;

public class singletonTest01 {
    //饿汉式
    private singletonTest01(){}

    private static  singletonTest01 instance =new singletonTest01();

    public  static  singletonTest01 getInstance(){
        return instance;
    }
}
class singletonTest{
    public static void main(String[] args) {
        singletonTest01 instance = singletonTest01.getInstance();
        singletonTest01 instance2 = singletonTest01.getInstance();

        System.out.println(instance ==instance2);

    }
}
