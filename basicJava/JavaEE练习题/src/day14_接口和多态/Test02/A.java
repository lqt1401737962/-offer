package day14_接口和多态.Test02;

/*
    A接口中，定义抽象方法showA。
    A接口中，定义默认方法showB。
 */
public interface A {
    void showA();

    default void showB() {
        System.out.println("我是B方法");
    }
}
