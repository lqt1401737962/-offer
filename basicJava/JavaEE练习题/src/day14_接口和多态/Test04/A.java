package day14_接口和多态.Test04;

/*A接口中，定义抽象方法showA。
    A接口中，定义私有静态方法show10（String str），循环打印10次str。
    A接口中，定义静态方法showB10，showC10，分别调用show10方法，传入参数。
    */
public interface A {
    void showA();

    static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }

    public static void showB10() {

        System.out.println("静态方法BBB");
        show10("BBB");
    }

    static void showC10() {

        System.out.println("静态CCC");
        show10("CCC");
    }
}
