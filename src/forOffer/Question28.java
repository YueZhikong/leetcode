package forOffer;

import java.util.ArrayList;
import java.util.Stack;

//包含min函数的栈
public class Question28 {
    //双栈
    class MinStack {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        /** initialize your data structure here. */
        public MinStack() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void push(int x) {
            if (stack1.size()==0){
                stack1.push(x);
                stack2.push(x);
            }
            else {
                stack1.push(x);
                if (x<=stack2.peek()){
                    stack2.push(x);
                }
            }
        }

        public void pop() {
            if (stack1.peek().equals(stack2.peek())){
                stack1.pop();
                stack2.pop();
            }
            else {
                stack1.pop();
            }
        }

        public int top() {
            return stack1.peek();
        }

        public int min() {
            return  stack2.peek();
        }
    }
}
