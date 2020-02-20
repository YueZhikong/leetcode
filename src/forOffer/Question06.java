package forOffer;

import java.util.Stack;
//用两个栈实现一个队列
public class Question06 {
    //我的解法，要删东西的时候，把栈1倒到栈2
    class CQueue {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        public CQueue() {

        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack1.size()==0){
                return -1;
            }
            else if (stack1.size()==1){
                return stack1.pop();
            }
            else {
                while (stack1.size()>0){
                    stack2.push(stack1.pop());
                }
                int result = stack2.pop();
                while (stack2.size()>0){
                    stack1.push(stack2.pop());
                }
                return result;
            }
        }
    }
    //应该有更快的方法，leetcode解法里没看到
}
