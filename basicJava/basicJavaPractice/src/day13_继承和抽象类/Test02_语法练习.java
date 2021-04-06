package day13_继承和抽象类;
/*
语法点：继承，抽象类
编写步骤：
    定义抽象类A，抽象类B继承A，普通类C继承B
    A类中，定义成员变量numa，赋值为10，抽象showA方法。
    B类中，定义成员变量numb，赋值为20，抽象showB方法。
    C类中，定义成员变量numc，赋值为30，重写showA方法，打印numa，重写showB方法，打印numb，定义showC方法，打印numc。
    测试类中，创建C对象，调用showA方法，showB方法，showC方法。
 */
public class Test02_语法练习 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
