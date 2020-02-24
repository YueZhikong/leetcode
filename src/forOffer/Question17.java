package forOffer;
//删除链表的节点
public class Question17 {
    //我的解法
    //不知道哪里有了问题
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p=head;
        ListNode q=head;
        ListNode newHead=head;
        while (newHead.val==val){
            newHead = newHead.next;
            p =newHead;
            q =newHead;
        }
        while (p.next!=null){
            q = p;
            p = p.next;
            if (p.val==val){
                q.next = p.next;
                ListNode c = p;
                p=p.next;
                c=null;
            }
        }
        return newHead;
    }
    //
    public ListNode deleteNode2(ListNode head, int val) {
        ListNode first = new ListNode(-1);
        first.next=head;
        ListNode curNode=first;
        while (curNode.next != null && curNode.next.val != val){
            curNode = curNode.next;
        }
        if (curNode.next != null){
            ListNode next = curNode.next;
            curNode.next = next.next;
            next.next = null; // help gc
        }
        return first.next;
    }
}
