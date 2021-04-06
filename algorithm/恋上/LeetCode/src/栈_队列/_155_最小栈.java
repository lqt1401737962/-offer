package 栈_队列;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/
 * @Auther Qitong!!
 * @Date 2020/6/12
 */
class MinStack {

    private  Stack<Integer> stack;
    private  Stack<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack= new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack == null){
            minStack.push(x);
        }else{                  //二中一
            minStack.push(Math.min(x,minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    }
