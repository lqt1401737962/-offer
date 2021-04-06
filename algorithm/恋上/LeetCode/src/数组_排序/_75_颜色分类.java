package 数组_排序;

/**
 * https://leetcode-cn.com/problems/sort-colors/
 * @Auther Qitong!!
 * @Date 2020/6/10
 */
public class _75_颜色分类 {
    public static void main(String[] args) {

    }

    /**
     * @Author Qitong~
     * @Description //TODO 荷兰国旗问题,这是快速排序的partiton过程
     *                  一个只包含0、1、2的整型数组，要求对它进行【原地】排序
     *                  你能想出一个仅使用常数空间的一趟扫描算法吗?
     *                  空间复杂度O(1)，时间复杂度O(n)
     * @Date 18:11 2020/6/10
     * @Param [nums]
     * @return void
     **/
    public void sortColors(int[] nums) {
        if (nums==null || nums.length <1) return ;
        int less = 0;
        int more = nums.length-1;
        int cur = 0;
        //cur指针大于more指针后停止
        while (cur <= more ){
            if(nums[cur]< 1){
                swap(nums, less++,cur++);
            }else if (nums[cur] ==1) {
                cur ++;
            }else{
                swap(nums,more--,cur);
            }
        }
    }
    private  void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
