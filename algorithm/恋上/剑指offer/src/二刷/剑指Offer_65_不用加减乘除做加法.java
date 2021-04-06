package 二刷;

/**
 * https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/13
 */
public class 剑指Offer_65_不用加减乘除做加法 {
    public int add(int a, int b) {
        //进位不为0 就继续
        while (b != 0) {
            int carry = (a & b) << 1;
            //a为非进位和
            a ^= b;
            //b为进位
            b = carry;
        }
        return a;
    }
}
