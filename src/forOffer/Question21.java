package forOffer;
//链表中倒数第k个节点
public class Question21 {
    //快慢指针方法

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode p = head;//慢的指针
        ListNode q = head;//快的指针

        while (k>1){
            q = q.next;
            if (q==null){
                return null;
            }
            k--;
        }
        while (q.next!=null){
            p=p.next;
            q=q.next;
        }
        return p;
    }
}
