package leetcode;

import java.util.Stack;

public class TwoStackToQueue {
    public Stack<Integer> popStack;
    public Stack<Integer> pushStack;

    public TwoStackToQueue() {
        popStack = new Stack<>();
        pushStack = new Stack<>();
    }
    public void pushToPop(){
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }


    public void add(int x){
        pushStack.push(x);
        pushToPop();
    }

    public int poll(){
        if (popStack.isEmpty()&&pushStack.isEmpty()){
            throw new RuntimeException("队列为空,无非返回");
        }
        else if (popStack.isEmpty()){
            pushToPop();
        }return popStack.pop();

    }

    public int peek(){
        if (popStack.isEmpty()&&pushStack.isEmpty()){
            throw new RuntimeException("队列为空怎么返回!");
        }
        pushToPop();
        return popStack.peek();
    }
    public boolean empty(){
        return pushStack.isEmpty()&&popStack.isEmpty();
    }


}
