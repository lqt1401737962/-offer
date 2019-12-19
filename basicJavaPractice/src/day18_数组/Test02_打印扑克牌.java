package day18_数组;
/*
打印扑克牌.
代码实现，效果如图所示：
开发提示：
使用两个字符串数组，分别保存花色和点数
 */
public class Test02_打印扑克牌 {
    public static void main(String[] args) {
        String [] strings1={"♠","♥","♦","♣"};
        String [] strings2 ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (int i = 0; i < strings1.length; i++) {
            for (int i1 = 0; i1 < strings2.length; i1++) {
                System.out.print(strings1[i]+strings2[i1]);
            }
            System.out.println();
        }
    }
}
