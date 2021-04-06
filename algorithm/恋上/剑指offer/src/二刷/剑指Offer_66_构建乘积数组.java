package 二刷;

/**
 * https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/18
 */
public class 剑指Offer_66_构建乘积数组 {
    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) return new int[0];

        //用于存放 矩阵左边部分的值
        int[] b = new int[a.length];
        //用来记录右边部分的积的值
        int temp = 1;
        //初始化
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            b[i] *= temp;
        }
        return b;
    }
}
