package com.qitong;

import java.util.Stack;

public class P31SequenceStack {
    public static boolean judgeSequenceStack(int[] pushSequence, int[] popSequence){
        Stack<Integer> stack = new Stack<>();
        int n=pushSequence.length;
        if (pushSequence==null||popSequence==null||n==0){
            return false;
        }
        for (int pushIndex = 0,popIndex=0; pushIndex < n; pushIndex++) {
            stack.push(pushSequence[pushIndex]);
            //栈顶元素和出栈序列下标的元素一样时，弹出栈顶元素，继续比较下一个出栈序列元素
            while (!stack.isEmpty() && popIndex < n && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }

        }
        return stack.isEmpty();
    }
}
