package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2017-2-15обнГ1:23:54
 */
class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class FindKthToTail {
	public ListNode FindKthToTail(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode preNode = head;
		for (int i = 0; i < k - 1; i++) {
			head = head.next;
			if (head == null)
				return null;
		}
		ListNode backNode = head;
		while (backNode.next != null) {
			backNode = backNode.next;
			preNode = preNode.next;
		}
		return preNode;
	}
}
