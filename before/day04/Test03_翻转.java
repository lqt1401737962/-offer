package day04;

public class Test03_翻转 {
    public static void main(String[] args) {
        int reverse = reverse(1933414231);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            return 0;
        }
        return y;
    }
}
