package QueueAndStack;

import java.util.Stack;

//有效的括号
public class Solution {
    //有效的括号
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()){
                    return false;
                }
                else {
                    if (s.charAt(i)==')'&&stack.peek()=='('){
                        stack.pop();
                    }
                    else if (s.charAt(i)=='}'&&stack.peek()=='{'){
                        stack.pop();
                    }
                    else if (s.charAt(i)==']'&&stack.peek()=='['){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if (stack.empty()){
            return true;
        }
        else {
            return false;
        }
    }
    //每日温度
    //复杂度比较高，不知道如何优化
    public int[] dailyTemperatures(int[] T) {
        if (T.length==0||T.length==1){
            return new int[T.length];
        }

        int[] result= new int[T.length];
        for (int i=0;i<T.length-1;i++){
            for (int j=i+1;j<T.length;j++){
                if (T[j]>T[i]){
                    result[i]=j-i;
                    break;
                }
            }
        }
        return result;
    }
    //逆波兰表达式求值
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<tokens.length;i++){
            if (tokens[i].equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if (tokens[i].equals("-")){
                stack.push(-(stack.pop()-stack.pop()));
            }
            else if (tokens[i].equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else if (tokens[i].equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }



}
