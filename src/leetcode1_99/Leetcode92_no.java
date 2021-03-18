package leetcode1_99;

import forOffer.ListNode;

import java.util.Stack;

public class Leetcode92_no {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int record=0;
        int i = 1;
        ListNode p = head;
        ListNode c = head;
        ListNode j = null;
        Stack<ListNode> stack = new Stack<>();
        while (p!=null){
            if (i==left){
                stack.push(p);
                record = stack.size();
            }
            if (i==right){
                break;
            }
            if (i==right-1){
                j=p;
            }
            p=p.next;
            i++;
        }
        while (true){
            if (stack.size()==record){
                ListNode q = stack.pop();
                q.next = j.next;
                j.next = q;
                if (stack.size()==0){
                    return p;
                }
                else {
                    q=stack.pop();
                    q.next=p;
                    return c;
                }
            }
            else {
                ListNode q = stack.pop();
                q.next=p.next;
                p.next=q;
            }
        }
    }
}
