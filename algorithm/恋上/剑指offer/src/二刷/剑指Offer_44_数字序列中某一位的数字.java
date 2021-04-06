package 二刷;

/**
 * https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/20
 */
public class 剑指Offer_44_数字序列中某一位的数字 {
    public int findNthDigit(int n) {
        //几位数, 开始1,10,100...  ,有多少位(1---9)(2---180)(3----2700)...
        int digit = 1;
        long start = 1;
        long count = 9;
        while (n > count) {
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }
        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
