package leetcode1_99;

import forOffer.ListNode;

import java.util.HashMap;

public class Leetcode83 {
    //不排序
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode p = head;
        ListNode q = head.next;
        HashMap<Integer,Object> hashMap = new HashMap<>();
        hashMap.put(p.val,p);
        while (q!=null){
            if (hashMap.get(q.val)==null){
                hashMap.put(q.val,q);
                p = p.next;
                q = q.next;
            }
            else {
                p.next = q.next;
                q = p.next;
            }
        }
        return head;
    }
    //排序
    public ListNode deleteDuplicates02(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
