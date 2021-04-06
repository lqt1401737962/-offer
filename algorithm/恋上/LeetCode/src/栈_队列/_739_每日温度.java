package 栈_队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/daily-temperatures/
 * @author  Qitong!!
 * @Date 2020/6/12
 */
public class _739_每日温度 {
    //即找到 右边第一个比他大的数!!
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length <1) return null;

        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() &&T[stack.peek()] < T[i]){
                res[stack.peek()]  = i - stack.pop();
            }
            stack.push(i);
        }

        return res;
    }
}
