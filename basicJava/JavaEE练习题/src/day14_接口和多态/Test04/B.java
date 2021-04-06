package day14_接口和多态.Test04;

import day14_接口和多态.Test03.A;

public class B implements A {

    @Override
    public void showA() {
        System.out.println("重写了AAA");
    }

    @Override
    public void show10(String str) {

    }

    public static void showD() {
        System.out.println("静态DDD");
    }
}
