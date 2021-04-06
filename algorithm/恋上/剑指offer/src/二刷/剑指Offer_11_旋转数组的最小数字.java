package 二刷;

/**
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 *
 * @author Qitong!!
 * @Date 2020/6/30
 */
public class 剑指Offer_11_旋转数组的最小数字 {
    /**
     * 类似于二分查找做  时间O(logN) 空间 O(1)
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) return -1;
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int mid = (r + l) >> 1;
            if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else if (numbers[mid] < numbers[r]) {
                r = mid;
            } else {
                r--;
            }
        }
        return numbers[l];
    }
}
