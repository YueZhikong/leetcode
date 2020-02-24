package forOffer;
//反转链表
public class Question23 {
    //我的想法，在l1上直接做修改，有点烦
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=l1;//指针
        ListNode q=l2;//指针
        //没写完
        while(true){
            if (p.val<=q.val){
                ListNode c = p.next;
                p.next = q;
                q = q.next;
                p = p.next;
                p.next = c;
                p = p.next;
            }
            else {
                p=p.next;
            }
        }
    }
    //直接新建一个链表，可能更好
    //递归
    public ListNode mergeTwoLists2(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
        else if (l2==null){
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
    //迭代
}
