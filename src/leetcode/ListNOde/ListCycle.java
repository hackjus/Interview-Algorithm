package leetcode.ListNOde;

import leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class ListCycle {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)return null;
        Set<ListNode> set = new HashSet<>();
        int size = 0;
        while(pHead!=null){
            set.add(pHead);
            if(size==set.size())return pHead;
            size++;
            pHead=pHead.next;
        }
        return null;
    }
}
