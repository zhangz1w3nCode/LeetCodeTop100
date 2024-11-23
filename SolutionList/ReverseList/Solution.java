package SolutionList.ReverseList;

import SolutionList.BasicStruct.ListNode;

public class Solution {

    /*
      thinking:
      1.指针的变化
      2.提前记录next节点
      3.递归写法注意递归结束条件
      4.空指针判断
     */

    //Iterate:
    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /*
      Recurse:
       #1:
        1 -> 2 -> <- 3
        1 -> 2 <- 3
       #2:
        1 -> <- 2 <- 3
        1 <- 2 <- 3
     */
    public ListNode reverseList2(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
