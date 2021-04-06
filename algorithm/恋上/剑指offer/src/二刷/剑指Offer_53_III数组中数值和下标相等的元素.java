package 二刷;

/**
 * https://www.acwing.com/problem/content/65/
 *
 * @author Qitong!!
 * @Date 2020/7/22
 */
public class 剑指Offer_53_III数组中数值和下标相等的元素 {
    public int getNumberSameAsIndex(int[] nums) {
        if (nums == null || nums.length ==0) return -1;
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid = l+ ((r-l)>>1);
            if (nums[mid] < mid){
                l = mid+1;
            }else if (nums[mid] >mid){
                r = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

