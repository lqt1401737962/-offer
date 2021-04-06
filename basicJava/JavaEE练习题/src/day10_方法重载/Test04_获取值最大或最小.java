package day10_方法重载;

//定义getValue方法，获取三个数中的最值，能够通过字符串，指定获取最大值或者最小值。
public class Test04_获取值最大或最小 {
    public static void main(String[] args) {
        getValue("小", 2, -111, 555);
    }

    private static void getValue(String s, int a, int b, int c) {
        switch (s) {
            case "小":
                int temp = (a < b) ? a : b;
                int min = (temp < c) ? temp : c;
                System.out.println("这三个数中最小值是:" + min);
                break;
            case "大":
                int temp2 = (a > b) ? a : b;
                int max = (temp2 > c) ? temp2 : c;
                System.out.println("这三个数中最大值是:" + max);
                break;
            default:
                System.out.println("你说什么啊");
        }
    }
}
