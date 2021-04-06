package 二刷;

/**
 * https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/12
 */
public class 剑指Offer_63_股票的最大利润 {
    //贪心!!
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        //记录 所扫过的 当日最低价默认为 0号 索引位置 和 最大能获得的利润
        int maxPro = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];

            maxPro = Math.max(maxPro, prices[i] - min);
        }
        return maxPro;
    }
}
