package 二刷;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/21
 */
public class 剑指Offer_51_数组中的逆序对 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length<2) return 0;

        //这一步问面试官能否改变原数组!!
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }
        int[] temp = new int[nums.length];
        return sort(copy,0,copy.length,temp);
    }

    private int sort(int[] nums, int l, int r, int[] temp) {
        if (r-l < 2) return 0;
        //注意java 运算符的优先级      + -   大于>> << >>>
        int mid = l+ ((r -l)>>1);
        //int mid = (r+l)>>1;
        int leftPairs = sort(nums, l, mid, temp);
        int rightPairs = sort(nums, mid, r, temp);

        int count = mergeAndCount(nums,l,mid,r,temp);
        return leftPairs+ rightPairs + count;
    }

    private int mergeAndCount(int[] nums, int l, int mid, int r, int[] temp) {
        for (int i = l; i < r ; i++) {
            temp[i] = nums[i];
        }

        int i =l;
        int j = mid;
        int count = 0;
        for (int k = l; k < r; k++) {
            if (i == mid){
                nums[k] = temp[j++];
            }else if(j == r){
                nums[k] = temp[i++];
            } else if (temp[i] <= temp[j]){
                nums[k] = temp[i++];
            }else{
                nums[k] = temp[j++];
                count += (mid - i );
            }
        }
        return count;
    }
}
