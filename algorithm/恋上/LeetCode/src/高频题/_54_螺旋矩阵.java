package 高频题;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/spiral-matrix/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _54_螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) return null;
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;

        int top = 0;
        int bottom = matrix.length-1;
        int l = 0;
        int r = matrix[0].length-1;

        while (top <= bottom && l<= r){
            //从 左上 到 右上
            for (int i = l; i <= r ; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            //从 右上 到 右下
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][r]);
            }
            r--;

            if (top > bottom || l > r) break;
            //从 右下 到 左下
            for (int i = r; i >= l ; i--) {
                list.add(matrix[bottom][i]);
            }
            bottom--;
            //从 左下 到 左上
            for (int i = bottom; i >= top ; i--) {
                list.add(matrix[i][l]);
            }
            l++;
        }
        return list;
    }
}
