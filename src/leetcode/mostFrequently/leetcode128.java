package leetcode.mostFrequently;

import leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class leetcode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentSum = num;
                int currentStep = 1;
                while (set.contains(currentSum + 1)) {
                    currentStep += 1;
                    currentSum += 1;
                }
                longest = Math.max(longest, currentStep);
            }
        }
        return longest;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode dummy = cur;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ListNode node = new ListNode(l1.val);
                dummy.next = node;
                dummy = node;
            } else {
                ListNode node = new ListNode(l2.val);
                dummy.next = node;
                dummy = node;
            }
        }
        while (l1 != null) {
            ListNode node = new ListNode(l1.val);
            dummy.next = node;
            dummy = node;
        }
        while (l2 != null) {
            ListNode node = new ListNode(l2.val);
            dummy.next = node;
            dummy = node;
        }
        return cur.next;
    }
    

}