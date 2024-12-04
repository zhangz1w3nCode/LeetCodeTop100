package SolutionList.DetectCycle;

import SolutionList.BasicDataStruct.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null){
            slow = slow.next;
            if(fast.next.next==null){
                return null;
            }
            fast = fast.next.next;
            if(slow == fast){
                ListNode cur = head;
                while(cur!=slow){
                    cur = cur.next;
                    slow = slow.next;
                }
                return cur;
            }
        }

        return null;
    }
}