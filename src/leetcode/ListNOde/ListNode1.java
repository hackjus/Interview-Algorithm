//package leetcode.ListNOde;
//
//public class ListNode1 {
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    public ListNode reverseList(ListNode head) {
//        ListNode cur = head;
//        ListNode prev = null;
//        ListNode next = null;
//        while (cur != null) {
//            next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }
//
//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode pre = dummy;
//        for (int i = 0; i < m - 1; i++) {
//            pre = pre.next;
//        }
//        ListNode cur = pre.next;
//        ListNode prev = null;
//        ListNode next = null;
//        for (int i = m; i <= n; i++) {
//            next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        pre.next.next = cur;
//        pre.next =
//    }
