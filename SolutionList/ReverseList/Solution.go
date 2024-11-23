package ReverseList

type ListNode struct {
	Val  int
	Next *ListNode
}

func reverseList1(head *ListNode) *ListNode {
	//Recurse
	if head == nil || head.Next == nil {
		return head
	}
	var pre *ListNode
	cur := head
	for cur != nil {
		next := cur.Next
		cur.Next = pre
		pre = cur
		cur = next
	}
	return pre
}

func reverseList2(head *ListNode) *ListNode {
	//Iterate
	if head == nil || head.Next == nil {
		return head
	}
	newHead := reverseList2(head.Next)
	newHead.Next.Next = head
	head.Next = nil
	return newHead
}
