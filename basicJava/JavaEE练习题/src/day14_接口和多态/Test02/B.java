package day14_接口和多态.Test02;

import day14_接口和多态.Test02.A;

public class B implements A {
    @Override
    public void showA() {
        System.out.println("我重写了A方法");
    }
}
