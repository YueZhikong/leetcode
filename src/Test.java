import java.util.Stack;

public class Test {
    Stack<Integer> stack1=new Stack();//stack1是主栈
    Stack<Integer> stack2=new Stack();//stack2装最小数的栈
    public void push(int node) {
        if(stack1.size()==0){
            stack1.add(node);
            stack2.add(node);
        }
        else{
            if(node<=stack2.peek()){
                stack1.add(node);
                stack2.add(node);
            }
            else{
                stack1.add(node);
            }
        }
    }

    public void pop() {
        if(stack1.size()!=0){
            if(stack1.peek()==stack2.peek()){
                stack1.pop();
                stack2.pop();
            }
            else{
                stack1.pop();
            }
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

    public static void main(String[] args) {
        Object object=new Object();
    }
}
