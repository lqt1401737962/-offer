package 二刷;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/3
 */
public class 剑指Offer_29_顺时针打印矩阵 {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null) return null;
        if (matrix.length == 0) return new int[]{};
        int[] res = new int[matrix.length * matrix[0].length];

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        //res 的索引位置!!
        int cur = 0;
        while (top <= bottom && left <= right) {
            //从 左上 到 右上
            for (int i = left; i <= right; i++) {
                res[cur++] = matrix[top][i];
            }
            top++;
            //从 右上 到 右下
            for (int i = top; i <= bottom; i++) {
                res[cur++] = matrix[i][right];
            }
            right--;

            if (top > bottom || left > right) break;

            //从 右下 到 左下
            for (int i = right; i >= left; i--) {
                res[cur++] = matrix[bottom][i];
            }
            bottom--;
            //从 左下 到 左上
            for (int i = bottom; i >= top; i--) {
                res[cur++] = matrix[i][left];
            }
            left++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(spiralOrder(matrix)));
    }
}
