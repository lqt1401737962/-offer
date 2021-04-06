package 二刷;

/**
 * https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_60_n个骰子的点数 {
    //动态规划!状态转移方程 :tmp[x+y]+=pre[x]*num[y];
    public double[] twoSum(int n) {
        double[] res = new double[]{1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d, 1 / 6d};
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[2 * i + 1];
            for (int j = 0; j < res.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] = res[j] / 6;
                }
            }
            res = temp;
        }
        return res;
    }
}
