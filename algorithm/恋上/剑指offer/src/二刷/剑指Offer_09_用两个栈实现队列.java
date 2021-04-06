package 二刷;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * @author Qitong!!
 * @Date 2020/7/18
 */
public class 剑指Offer_09_用两个栈实现队列 {

}
class CQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;
    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {

        if (!outStack.isEmpty()) return outStack.pop();
        if (inStack.isEmpty()) return -1;
        if (outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
