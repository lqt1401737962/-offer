package 数组_排序;
import java.util.Arrays;


/**https://leetcode-cn.com/problems/merge-sorted-array/submissions/
 * @author  Qitong!!
 * @Date 2020/6/10
 */
public class _88_合并两个有序数组 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        merge(nums1,3,new int [] {2,5,6},3 );
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * @Author Qitong~
     * @Description //TODO 从后面往前面遍历
     *                  给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，
     *                  使 nums1 成为一个有序数组。
     * @Date 17:55 2020/6/10
     * @Param [nums1, m, nums2, n]
     * @return void
     **/
    //时间O(n) 空间O(1)
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n -1;
        int cur = nums1.length-1;
        while (j>=0){
            if (i<0 || nums1[i] < nums2[j]){
                nums1[cur--] = nums2[j--];
            }else {   // 等价于 i>= 0 && nums1[i] > nums[j]
                nums1[cur--] = nums1[i--];
            }
        }
    }
}
