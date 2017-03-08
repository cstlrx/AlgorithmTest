package swordToOffer;

/**
 * @author lrx
 * @time 2016-11-9下午9:27:09
 */

/*
 * 反转链表,思路：使用头插法插回去 思路2：一遍循环，循环至向前一个
 */
public class ReverseListT {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode ReverseList(ListNode head) {
		ListNode tail = null;
		if (head == null)
			return null;
		tail = head;
		head = head.next;
		tail.next = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = tail;
			tail = head;
			head = temp;
		}
		return tail;
	}

	public ListNode ReverseList2(ListNode head) {
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			// pre = head;
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

	public static void main(String[] args) {

	}
}
