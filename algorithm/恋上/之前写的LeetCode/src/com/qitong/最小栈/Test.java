package com.qitong.最小栈;

public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(5);
        minStack.push(3);
        minStack.push(1);
        minStack.push(10);
        minStack.push(7);
        minStack.pop();
        System.out.println("minStack.top() = " + minStack.top());
        System.out.println("minStack.getMin() = " + minStack.getMin());
    }
}
