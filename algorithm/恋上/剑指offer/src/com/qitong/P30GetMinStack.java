package com.qitong;

import java.util.Stack;

public class P30GetMinStack {
    public Stack<Integer> dataStack;
    public Stack<Integer> minStack;

    public P30GetMinStack() {
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }


    public void push(int val){
        dataStack.push(val);
        if (minStack.isEmpty()){
            minStack.push(val);
        }else{
            if (minStack.peek()<val){
                minStack.push(minStack.peek());
            }else{
                minStack.push(val);
            }
        }

    }

    public int pop(){
        if (dataStack.isEmpty()){
            throw new RuntimeException("你的栈里是空的啊");
        }
        minStack.pop();
        return dataStack.pop();
    }
    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        P30GetMinStack stack = new P30GetMinStack();

        stack.  pop();
        System.out.println(stack.getMin());
    }
}
