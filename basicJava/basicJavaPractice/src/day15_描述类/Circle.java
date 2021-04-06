package day15_描述类;
/*
定义一个圆形Circle类。
    属性：
    r：半径
    构造方法：
    无参构造方法
    满参构造方法
    成员方法：
    get/set方法
    showArea方法：打印圆形面积
    showPerimeter方法：打印圆形周长
 */
public class Circle {
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public  double showArea(){
        double pi = Math.PI;
        double area=r*r* pi;
        return area;
    }
    public   double showPerimeter(){
        double perimeter=2*r*Math.PI;
        return perimeter;
    }
}
