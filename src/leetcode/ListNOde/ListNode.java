package leetcode.ListNOde;

public class ListNode {

//    *  temp,a,b,c,
//    * start=a,end=b;temp指向end;start执行end的next;tmp-b,a-c;b-a;temp=a;
//    *
//    *
//    *

    public leetcode.ListNode swapPairs(leetcode.ListNode head) {
        leetcode.ListNode dummy = new leetcode.ListNode(-1);
        dummy.next = head;
        leetcode.ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null) {
            leetcode.ListNode start = temp.next;
            leetcode.ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return dummy.next;
    }
//    * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
//
//说明:
//1 ≤ m ≤ n ≤ 链表长度。
//输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL
//    *
//    *

    public leetcode.ListNode reverseBetween(leetcode.ListNode head, int m, int n) {
        leetcode.ListNode dummy = new leetcode.ListNode(0);
        dummy.next = head;
        leetcode.ListNode pre = dummy;
        for (int i = 0; i < m; i++) {
            pre = pre.next;
        }
        leetcode.ListNode cur = pre.next;
        leetcode.ListNode prev = null;
        leetcode.ListNode next = null;
        for (int i = m; i <= n; i++) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        pre.next.next = cur;
        pre.next = prev;
        return dummy.next;
    }

}
