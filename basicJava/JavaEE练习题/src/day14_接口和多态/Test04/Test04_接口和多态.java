package day14_接口和多态.Test04;

/*
    定义接口A，普通类B实现接口A。
    A接口中，定义抽象方法showA。
    A接口中，定义私有静态方法show10（String str），循环打印10次str。
    A接口中，定义静态方法showB10，showC10，分别调用show10方法，传入参数。
    B类中，定义静态方法showD
    测试类中，使用A接口，调用静态showB10方法，showC10方法，
    测试类中，使用B类，调用showA方法，showD方法。
 */
public class Test04_接口和多态 {
    public static void main(String[] args) {
        A.showB10();
        A.showC10();
        B b = new B();
        b.showA();
        B.showD();
    }
}
