package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveCycle {
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        Set<ListNode> s = new HashSet<>();
        ListNode temp = head;
        s.add(temp);
        while (temp.next!=null) {
            ListNode nex = temp.next;
            if (s.contains(nex)) {
                return nex;
            } else {
                s.add(nex);
            }
            temp = temp.next;
        }
        return null;
    }

}
