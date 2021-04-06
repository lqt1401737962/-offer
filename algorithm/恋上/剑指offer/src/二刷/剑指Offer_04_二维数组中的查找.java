package 二刷;

/**
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_04_二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        //从左下 或者右上开始
        int left = 0, bottom = matrix.length - 1;
        while (left < matrix[0].length && bottom >= 0) {
            if (matrix[bottom][left] > target) {
                bottom--;
            } else if (matrix[bottom][left] < target) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
}
