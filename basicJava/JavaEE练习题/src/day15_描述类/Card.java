package day15_描述类;

/*
定义一个扑克Card类。
构造方法：
满参构造方法
成员方法：
showCard方法：打印牌面信息
 */
public class Card {
    //属性：
    private String color;//花色
    private String num;//点数

    public Card() {
    }

    public Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    //成员方法：
    //showCard方法：打印牌面信息
    public void showCard() {
        System.out.println("颜色" + color +
                "点数" + num);
    }
}
