package day05_Math类;

/*
    模拟简单计算器，可以运算+，—，*，/，%。
        接收三个参数，一个整数，一个运算符，另一个整数。
        计算出运算结果。
        无法运算时，返回null。
 */
public class Test07_模拟计算器 {
    public static void main(String[] args) {
        int cal = cal(3, "+", 4);
    }

    public static int cal(int a, String s, int b) {
        if (s.equals("+")) {
            return a + b;
        }
        if (s.equals("-")) {
            return a - b;
        }
        if (s.equals("*")) {
            return a * b;
        }
        if (s.equals("/") || b != 0) {
            return a / b;
        } else {
            return 0;
        }

    }
}
