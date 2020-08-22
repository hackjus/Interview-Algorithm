package leetcode.ListNOde;

import leetcode.ListNode;

public class ListNodeSum_链表求和 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1=l1;
        ListNode cur2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        int carry=0;
        while(cur1!=null&&cur2!=null){
            int val=cur1.val+cur2.val+carry;
             carry=val/10;
            cur.next=new ListNode(val%10);
            cur1= cur1.next;
            cur2= cur2.next;
            cur=cur.next;
        }
        while (cur1!=null){
            int val=cur1.val+carry;
             carry=val/10;
            cur.next=new ListNode(val%10);
            cur1=cur1.next;
            cur=cur.next;
        }
        while (cur1!=null){
            int val=cur2.val+carry;
            carry=val/10;
            cur.next=new ListNode(val%10);
            cur2=cur2.next;
            cur=cur.next;
        }
        if(cur1==null&&cur2==null){
            if(carry!=0){
                cur.next=new ListNode(carry);
            }
        }
        return dummy.next;
    }

}
