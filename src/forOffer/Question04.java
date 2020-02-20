package forOffer;

import java.util.ArrayList;
import java.util.Stack;

//从尾到头打印链表
public class Question04 {
    //按顺序放到栈里，再弹到数组里
    public int[] reversePrint(ListNode head) {
        if (head==null){
            return new int[0];
        }
        else {
            Stack<Integer> stack = new Stack<>();
            ListNode p = head;
            while (p!=null){
                stack.push(p.val);
                p = p.next;
            }
            int[] result = new int[stack.size()];
            int i =0;
            while (stack.size()>0){
                result[i] = stack.pop();
                i++;
            }
            return result;
        }
    }
    //官方题解，一样思路，取出int值的时机不一样，速度就不一样了
    public int[] reversePrint02(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }
    //递归法，想不到呀
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint03(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }
    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

}
