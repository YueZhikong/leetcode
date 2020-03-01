package leetcode1_99;

import forOffer.ListNode;

public class Leetcode02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag1 = true; //指向listNode1的指针没有走到头

        boolean flag2 = true; //指向ListNode2的指针没有走到头
        ListNode p;
        p = l1;//p指向l1，下同
        ListNode q;
        q = l2;
        ListNode sum = new ListNode(0);
        ListNode h;
        h = sum;
        ListNode c = sum;
        int carry = 0;//进位
        while (flag1 | flag2){
            if (flag1==true & flag2 == true){
                h.val = (p.val + q.val + carry)%10;
                carry = (p.val + q.val + carry)/10;//产生进位
            }else if (flag1==true & flag2 ==false){
                h.val = (p.val + carry)%10;
                carry = (p.val + carry)/10;
            }else if (flag1 == false & flag2 == true){
                h.val = (q.val + carry)%10;
                carry = (q.val + carry)/10;
            }
            h.next = new ListNode(0);
            c = h;
            h = h.next;

            if (p.next == null){
                flag1 = false;
            }else {
                p = p.next;
            }
            if (q.next == null){
                flag2 = false;
            }else {
                q = q.next;
            }

        }
        c.next.val = carry;//有时候只留下一个进位，以上步骤不能处理
        if(c.next.val == 0){
            c.next =null;
        }//有时会进了一个0，要去掉
        return sum;
    }
}
