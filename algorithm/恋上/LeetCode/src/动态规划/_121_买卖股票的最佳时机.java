package 动态规划;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @author  Qitong!!
 * @Date 2020/6/15
 */
public class _121_买卖股票的最佳时机 {


    /**
     * @Author Qitong~
     * @Description //TODO 输入: [7,1,5,3,6,4]
     *                  输出: 5
     *                  解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *                  注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     * @Date 19:56 2020/6/15
     * @Param [prices]
     * @return int
     **/
    //动态规划!!   但效率没有那么高!
    //时间O(N) 空间O(N)
    public int maxProfit(int[] prices){
        if(prices == null ||prices.length<2 ) return 0;

        //求差价数组 ==> 求最大连续子数组和
        int[] nums = new int[prices.length];
        nums[0] = 0;
        for (int i = 1; i <prices.length ; i++) {
            nums[i] = prices[i] - prices[i-1];
        }

        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            if (dp <= 0) {
                dp = nums[i];
            } else {
                dp = dp + nums[i];
            }
            max = Math.max(dp, max);
        }
        return max;

    }

    //这个是贪心!
    public int maxProfit2(int[] prices) {

        if(prices == null ||prices.length<2 ) return 0;

        //最大 利润
        int maxProfit = 0;
        //记录 扫描的 最小值
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min > prices[i]){
                min = prices[i];
            }
            maxProfit = Math.max(maxProfit,prices[i] - min);

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        _121_买卖股票的最佳时机 o= new _121_买卖股票的最佳时机();
        System.out.println(o.maxProfit(new int[]{2, 3, 5, 67, 71, -1}));
    }
}
