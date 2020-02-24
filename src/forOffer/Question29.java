package forOffer;

import java.util.Stack;

//栈的压入、弹出序列
public class Question29 {
    //我的解法
    //复现过程
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length==0||popped.length==0){
            if (pushed.length==0&&popped.length==0){
                return true;
            }
            else {
                return false;
            }
        }
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        while (i<pushed.length){
            stack.push(pushed[i]);
            i++;
            while (stack.size()!=0){
                if (stack.peek()==popped[j]){
                    stack.pop();
                    j++;
                }
                else {
                    break;
                }
            }
            if (j==popped.length){
                return true;
            }
        }
        return false;
    }
    //同样是复现过程，不用引入新的栈，直接使用pushed
    public boolean validateStackSequences2(int[] pushed, int[] popped) {
        int size = 0;
        for (int i = 0, j = 0; i < pushed.length; i++) {
            pushed[size++] = pushed[i];
            while (size != 0 && pushed[size - 1] == popped[j]) {
                size--; j++;
            }
        }
        return size == 0;
    }
}
