package leetcode.ListNOde;

import leetcode.ListNode;

public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode prev=null,next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
