package 广联达;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Qitong!!
 * @Date 2020/9/9
 */
public class 小草的最小高度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }

        System.out.println(getGlassLowHeight(ai,m,x));
    }

    //todo: 找到最小草的高度  时间O(MN) 空间O(1)
    public static int getGlassLowHeight(int[] glasses,int m,int x){
        if (glasses == null || glasses.length==0) return 0;
        //最小数的索引
        int min = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < glasses.length; j++) {
                if (glasses[i] <glasses[min]) min = i;
            }
            glasses[i] += x;
        }
        return glasses[min];
    }
}
