package day13_继承和抽象类;
/*
定义普通鸭子类(Duck)
    提供空参和带参构造方法
    重写showSymptom方法，打印症状信息。
 */
public class Duck extends Poultry{
    @Override
    public void showSymptom() {
        System.out.println("鸭子嘎嘎叫,感冒了");
    }

    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }
}
