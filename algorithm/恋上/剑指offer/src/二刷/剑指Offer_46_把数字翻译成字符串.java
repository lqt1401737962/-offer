package 二刷;

/**https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 * @author Qitong!!
 * @Date 2020/7/19
 */
public class 剑指Offer_46_把数字翻译成字符串 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()+1];
        //初始化
        dp[0]=1;
        dp[1] =1;
        for (int i = 2; i <= s.length(); i++) {
            String sub = s.substring(i - 2, i);
            if (sub.compareTo("10")>=0&&sub.compareTo("25")<=0){
                dp[i] = dp[i-1]+dp[i-2];
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length()];
    }
}
