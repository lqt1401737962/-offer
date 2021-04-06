package day10_方法重载;

//定义round方法，接收一位小数，实现四舍五入运算，并返回结果。
public class Test06_四舍五入 {
    public static void main(String[] args) {
        int round = round(23.4);
        System.out.println(round);
        System.out.println(round(23.5));
    }

    private static int round(double d) {
        int i = (int) (d + 0.5);
        return i;

    }
}
