package com.qitong.最小栈;

import java.util.Stack;
/*
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
    push(x) -- 将元素 x 推入栈中。
    pop() -- 删除栈顶的元素。
    top() -- 获取栈顶元素。
    getMin() -- 检索栈中的最小元素。

 */
public class MinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MinStack() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public  void push(int x){
        if (stackMin.isEmpty()){
            stackMin.push(x);
        }else if (stackMin.peek()< x){
            Integer peek = stackMin.peek();
            stackMin.push(peek);
        }else{
            stackMin.push(x);
        }
        stackData.push(x);
    }
    public  void pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("你的栈为空!!!");
        }
        stackMin.pop();
        stackData.pop();
    }
    public  int top(){
        if (stackData.isEmpty()){
            throw new RuntimeException("You stack is Empty!!");
        }
        Integer re = stackData.peek();
        return re;
    }
    public  int getMin(){
        if (stackMin.isEmpty()){
            throw new RuntimeException("You stack is Empty!");
        }
        return stackMin.peek();
    }
}
