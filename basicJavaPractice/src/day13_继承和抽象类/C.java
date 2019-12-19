package day13_继承和抽象类;

public class C extends B {
    int numc=30;
    @Override
    public void showB() {
        System.out.println(numb);
    }

    @Override
    public void showA() {
        System.out.println(numa);
    }
    public void showC(){
        System.out.println(numc);
    }
}
