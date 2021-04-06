package 二刷;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof
 *
 * @author Qitong!!
 * @Date 2020/7/8
 */
public class 剑指Offer_56_I_数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        if (nums == null) return null;

        int i = 0;
        for (int num : nums) {
            i ^= num;
        }
        //获得最低位的一
        int mask = 1;
        while ((i & mask) == 0) {
            mask <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
