package SolutionList.SwapPairs;

import SolutionList.BasicDataStruct.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;

        ListNode pre = new ListNode(0,head);
        ListNode res = pre;

        while(pre.next!=null&&pre.next.next!=null){
            ListNode start = pre.next;
            ListNode end   = pre.next.next;
            ListNode next  = pre.next.next.next;

            pre.next = end;
            end.next = start;
            start.next = next;

            pre = start;
        }


        return res.next;
    }
}
