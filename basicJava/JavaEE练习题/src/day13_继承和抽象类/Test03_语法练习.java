package day13_继承和抽象类;

/*
编写步骤：
    模拟农学院动物医疗系统信息。



 */
public class Test03_语法练习 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setAge(12);
        duck.setName("gaga");
        duck.setIllness("下水太多了导致扁桃体发炎了");
        duck.setSymptom("一直咳嗽");
        duck.showSymptom();
        duck.showMsg();
    }
}
