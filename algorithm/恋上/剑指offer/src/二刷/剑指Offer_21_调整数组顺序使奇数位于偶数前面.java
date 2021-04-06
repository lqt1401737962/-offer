package 二刷;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/2
 */
public class 剑指Offer_21_调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        //odd为奇数的位置,even为偶数的位置  cur指向便利的元素
        int odd = 0, even = nums.length - 1, cur = 0;
        //当相遇时及认定为已经完成
        while (odd < even) {
            if ((nums[cur] & 1) == 1) {
                odd++;
                cur++;
            } else {
                swap(nums, cur, even--);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
