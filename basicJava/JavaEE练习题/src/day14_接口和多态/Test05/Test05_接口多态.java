package day14_接口和多态.Test05;

/*
    定义接口Universe，提供抽象方法doAnything。
    定义普通类Star，提供成员发光shine方法
    定义普通类Sun，继承Star类，实现Universe接口
    测试类中，创建Star对象，调用shine方法
    测试类中，多态的方式创建Sun对象，调用doAnything方法，向下转型，调用shine方法。
 */
public class Test05_接口多态 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        Universe sun = new Sun();
        sun.doAnything();
        Sun sun1 = (Sun) sun;
        sun1.shine();
    }
}
