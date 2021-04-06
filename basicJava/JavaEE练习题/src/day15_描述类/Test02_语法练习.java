package day15_描述类;

/*

    定义测试类，创建Circle对象，并测试。
 */
public class Test02_语法练习 {
    public static void main(String[] args) {
        Circle circle = new Circle(55);
        double v = circle.showArea();
        System.out.println("这个圆形的面积是:" + v);
        System.out.println("这个圆形的周长是:" + circle.showPerimeter());
    }
}
