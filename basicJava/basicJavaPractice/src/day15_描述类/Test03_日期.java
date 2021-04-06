package day15_描述类;
/*

定义测试类，创建MyDate对象，并测试。
 */
public class Test03_日期 {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2000, 11, 04);
        myDate.showDate();
        System.out.println(myDate.isBi());;
    }
}
