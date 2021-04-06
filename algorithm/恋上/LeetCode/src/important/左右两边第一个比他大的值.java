package important;

import java.util.Stack;

/**
 * @author Qitong!!
 * @Date 2020/6/25
 */
public class 左右两边第一个比他大的值 {
    public void parentIndexes(int[] nums) {
        if (nums == null || nums.length <1)return;

        /*
         * 1.扫描一遍所有的元素
         * 2.保持栈从栈底到栈顶是单调递减的
         */
        //右边第一个比他大的
        int[] ris = new int[nums.length];
        //左边第一个比他大的
        int[] lis = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        //初始化!
        for (int i = 0; i < nums.length; i++) {
            ris[i] = -1;
            lis[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()]< nums[i]){
                ris[stack.pop()] = i;
            }
            if (!stack.isEmpty()){
                lis[stack.peek()] = i;
            }
            stack.push(i);
        }
    }
}
