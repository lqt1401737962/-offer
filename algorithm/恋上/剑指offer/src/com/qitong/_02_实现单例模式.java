package com.qitong;



//单例枚举模式
enum Eume {
    INSTANCE;

    public Eume getInstance(){
        return INSTANCE;
    }

}

//恶汉式
class Hungry {
    private static Hungry instance = new Hungry(); ;
    private Hungry(){

    }

    public Hungry getInstance(){
        return instance;
    }
}
//懒汉式
class LazyMan{
    private static volatile LazyMan instance ;
    private LazyMan (){
    }
    public static  LazyMan getInstance(){
        if (instance == null){
            synchronized (LazyMan.class){
                if (instance == null){
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }
}

//静态内部类
class Singleton{
    private Singleton(){}

    private static class inner{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return inner.instance;
    }
}




public class _02_实现单例模式{

}
