package forOffer;
//两个链表的第一个公共节点

public class Question53 {
    //不清楚为什么不行
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        boolean flag = true;
        while (p!=q){
            if (flag){
                if (p==null){
                    return null;
                }
                p=p.next;
                flag=false;
            }
            else {
                if (q==null){
                    return null;
                }
                q=q.next;
                flag=true;
            }
        }
        return p;
    }
}
