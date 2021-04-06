package com.qitong;

import java.util.Stack;

//两个栈实现队列
//方法appendTail,deleteHead
public class P09TwoStackToQueue {
    private static Stack<Integer> pushStack;
    private static Stack<Integer> popStack;

    public P09TwoStackToQueue() {
        pushStack =new Stack<Integer>();
        popStack =new Stack<Integer>();
    }

    public static void appendTail(int val){
        pushStack.push(val);
        pushToPop();
    }

    public static int deleteHead(){
        if (popStack.isEmpty() && pushStack.isEmpty()){
            throw new RuntimeException("队列里没有东西删不掉呢");
        }
        pushToPop();
        return popStack.pop() ;
    }

    //导数据的操作
    private static void pushToPop(){
        if (popStack.isEmpty()){
            while (!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
    }

}
