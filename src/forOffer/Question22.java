package forOffer;


//反转链表
public class Question22 {
    //我的想法，暴力遍历
    public ListNode reverseList(ListNode head) {
        return null;
    }
    //递归
    //也等于暴力遍历，不太行
    public ListNode reverseList02(ListNode head) {
        ListNode newHead=new ListNode(0);
        return null;
    }
    public ListNode reverse(ListNode head,ListNode newHead){
//        ListNode p=head;
//        ListNode q = newHead;
//        if (p==null){
//            return newHead;
//        }
//        else {
//            ListNode c = null;
//            while (p.next!=null){
//                c=p;
//                p = p.next;
//            }
//            q.next=p;
//            c.next=null;
//        }
        return null;
    }
    //双指针迭代
    public ListNode reverseList2(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while (cur!=null){
            tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
    //递归解法
    public ListNode reverseList3(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode cur = reverseList3(head.next);
        head.next.next=head;
        head.next=null;
        return cur;
    }
}
