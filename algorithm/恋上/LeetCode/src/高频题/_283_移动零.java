package 高频题;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author Qitong!!
 * @Date 2020/6/21
 */
public class _283_移动零 {
    //时间O(n) 空间O(1)
    public void moveZeroes(int[] nums) {
        if (nums == null|| nums.length==0) return;
        int cur = -1;
        //找到cur为数组中第一个0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                cur = i;
                break;
            }
        }
        if (cur ==-1 ) return;
        for (int i = cur+1; i < nums.length; i++) {
            if (nums[i]==0) continue;
            else{
                int temp =nums[i];
                nums[i] = nums[cur];
                nums[cur] = temp;
                cur++;
            }
        }

    }
    public void moveZeroes2(int[] nums) {
        if (nums == null) return;

        for (int i = 0, cur = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (cur != i) {
                nums[cur] = nums[i];
                nums[i] = 0;
            }
            cur++;
        }
    }
}
