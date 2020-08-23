package leetcode.ListNOde;

import leetcode.ListNode;

public class 链表二二翻转 {

    /*
    *  temp,a,b,c,
    * start=a,end=b;temp指向end;start执行end的next;tmp-b,a-c;b-a;temp=a;
    *
    *
    * */
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null&&temp.next.next!=null){
            ListNode start=temp.next;
            ListNode end=temp.next.next;
            temp.next=end;
            start.next=end.next;
            end.next=start;
            temp=start;
        }
        return dummy.next;
    }

}