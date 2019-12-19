package day14_接口和多态.Test02;

import day14_接口和多态.Test02.B;

/*
    定义接口A，普通类B实现接口A
    A接口中，定义抽象方法showA。
    A接口中，定义默认方法showB。
    B类中，重写showA方法
    测试类中，创建B类对象，调用showA方法，showB方法。
 */
public class Test02_按步骤写 {
    public static void main(String[] args) {
        B b = new B();
        b.showA();
        b.showB();
    }
}
