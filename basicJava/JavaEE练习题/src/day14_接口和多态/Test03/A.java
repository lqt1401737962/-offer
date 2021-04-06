package day14_接口和多态.Test03;

/*A接口中，定义抽象方法showA。
        A接口中，定义私有方法show10（String str），循环打印10次str。
        A接口中，定义默认方法showB10，showC10，分别调用show10方法，传入参数。*/
public interface A {
    void showA();

    void show10(String str);

    default void showB10() {
        System.out.println("BBB");
    }

    default void showC10() {
        System.out.println("CCC");
    }
}
