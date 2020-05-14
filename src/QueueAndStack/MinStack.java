package QueueAndStack;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    public MinStack() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        if (stack2.empty()){
            stack1.push(x);
            stack2.push(x);
        }
        else {
            if (x<=stack2.peek()){
                stack1.push(x);
                stack2.push(x);
            }
            else {
                stack1.push(x);
            }
        }
    }

    public void pop() {

        if (!stack1.empty()&&stack1.peek().equals(stack2.peek())){
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

    public int getMin() {
        return stack2.peek();
    }

}
