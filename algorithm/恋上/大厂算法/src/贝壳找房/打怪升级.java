package 贝壳找房;

import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/7
 */
public class 打怪升级 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] consume = new int[n<<1];
        int[] restore = new int[n<<1];

        for (int i = 0; i < n<<1; i++) {
            consume[i] = sc.nextInt();
        }
        for (int i = 0; i < n<<1; i++) {
            restore[i] = sc.nextInt();
        }

        System.out.println(maxValueExactly(restore, consume));
    }
    public static int maxValueExactly(int[] consume, int[] restore) {
        if (consume == null || consume.length == 0) return 0;
        if (restore == null || restore.length == 0) return 0;
        int res = 1;
        for (int i = consume.length-1; i >=consume.length/2 ; i--) {
            res = res + consume[i] - restore[i];
        }
        for (int i = 0; i <consume.length/2 ; i++) {
            res = res + consume[i] - restore[i];
        }
        return res;

    }
}
