package forOffer;
//复杂链表的复制
public class Question35focus {
    //我没有想法，失败了
    public Node copyRandomList(Node head) {
        Node p = null;
        copy(p,head);
        return p;
    }
    public void copy(Node p,Node head){
        if (head==null){
            p=null;
        }
        else {
            p = new Node(head.val);
            copy(p.next,head.next);
            copy(p.random,head.random);
        }
    }
}
