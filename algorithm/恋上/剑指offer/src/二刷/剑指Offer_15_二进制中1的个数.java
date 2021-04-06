package 二刷;

/**
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_15_二进制中1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public int hammingWeight2(int n) {
        //为了防止负数右移出现死循环的情况
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) res++;
            //无符号右移
            n >>>= 1;
        }
        return res;
    }

    public int hammingWeight3(int n) {
        int res = 0, flag = 1;
        while (n != 0) {
            if ((n & flag) != 0) res++;
            flag <<= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(1 >>> 2);
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(-5 >> 1));
        System.out.println(Integer.toBinaryString(-5 >>> 1));
        System.out.println(-5 >>> 2);
    }
}
