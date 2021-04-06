package 二刷;

/**
 * https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/19
 */
public class 剑指Offer_43_1到n整数中1出现的次数 {
    public int countDigitOne(int n) {
        //cur 在哪一位上 初始是个位!
        int res = 0, digit = 1;
        //高位,cur,和低位
        int high = n / 10, cur = n % 10, low = 0;
        while (high != 0 || cur != 0) {
            //三种情况 cur位上为0,1和大于1
            if (cur == 0) res += high * digit;
            else if (cur == 1) res += high * digit + low + 1;
            else {
                res += (high + 1) * digit;
            }

            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
        }
        return res;
    }
}
