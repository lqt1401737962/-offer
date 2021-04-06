package day10_方法重载;

//定义printX方法，打印任意行的图形。
public class Test05_打印图形 {
    public static void main(String[] args) {
        printX(23);
    }

    private static void printX(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("**");
        }
    }
}
