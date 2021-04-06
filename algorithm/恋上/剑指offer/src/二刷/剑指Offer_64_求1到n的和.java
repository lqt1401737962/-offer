package 二刷;

/**
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/13
 */
public class 剑指Offer_64_求1到n的和 {
    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
