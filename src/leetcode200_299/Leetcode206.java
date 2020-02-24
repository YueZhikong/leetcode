package leetcode200_299;

import forOffer.ListNode;
//反转链表
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        if (head.next==null){
            return head;
        }
        ListNode q=head;
        ListNode p=head.next;
        while (true){
            if (q.next==p){
                q.next=null;
            }
            if (p.next==null){
                p.next=q;
                return p;
            }
            else {
                ListNode c=p.next;
                p.next=q;
                q=p;
                p=c;
            }
        }
    }
}
