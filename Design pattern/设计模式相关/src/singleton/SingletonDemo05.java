package singleton;

public enum SingletonDemo05 {
    INSTANCE;

    public  SingletonDemo05 getInstance(){
        return INSTANCE;
    }

}
class SingletonTest05{
    public static void main(String[] args) {
        SingletonDemo05 instance = SingletonDemo05.INSTANCE;
        SingletonDemo05 instance2 = SingletonDemo05.INSTANCE;

        System.out.println(instance ==instance2);

    }
}
