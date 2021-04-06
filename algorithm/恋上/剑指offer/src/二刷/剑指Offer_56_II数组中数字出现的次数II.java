package 二刷;

import com.sun.corba.se.spi.ior.MakeImmutable;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/9
 */
public class 剑指Offer_56_II数组中数字出现的次数II {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        //java int类型有32位，其中首位为符号位
        int[] bitSum = new int[32];
        int res = 0;
        for (int num : nums) {
            //初始化
            int mask = 1;
            for (int i = 31; i >= 0; i--) {
                if ((mask & num) == 1) bitSum[i]++;
                mask <<= 1;
            }
        }

        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += (bitSum[i] % 3);
        }
        return res;
    }
}
