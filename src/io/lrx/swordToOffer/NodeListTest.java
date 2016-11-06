package io.lrx.swordToOffer;

import java.util.ArrayList;

/**
 * @author lrx
 * @time 2016-11-6上午10:08:51
 */
/*
 * 输入一个链表，从尾到头打印链表每个节点的值。 输入描述: 输入为链表的表头
 * 
 * 输出描述: 输出为需要打印的“新链表”的表头
 */
/*
 * 1、高手直接用栈，挨个入栈，挨个出栈， 2、递归
 */
public class NodeListTest {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ListNode head = null;
		/*
		 * 逆置链表，使用头插法
		 */
		// System.out.println(listNode.val);// 7
		// System.out.println(listNode.next.val);// 3
		// System.out.println(listNode.next.next);// null
		while (listNode != null) {
			if (head == null) {
				head = listNode;
				// 刚开始没加下面的两行，导致head指向自己，形成死循环
				listNode = listNode.next;
				// 不加下面这句还是死循环
				head.next = null;
			} else {
				ListNode temp = listNode;
				listNode = listNode.next;
				temp.next = head;
				head = temp;
			}
		}
		// System.out.println(head.val);//3
		// System.out.println(head.next.val);//7
		// System.out.println(head.next.next.val);//7
		// 这就很尴尬了，难道不是默认为null吗
		/*
		 * 遍历逆置后的链表
		 */
		ArrayList<Integer> result = new ArrayList<Integer>();
		// result.add(5);
		/*
		 * 发生溢出异常
		 */
		while (head != null) {
			result.add(head.val);
			// System.out.println(head.val);
			head = head.next;
		}

		return result;
	}

	public static void main(String[] args) {
		NodeListTest test = new NodeListTest();
		ListNode l = test.new ListNode(7);
		l.next = test.new ListNode(3);
		ArrayList<Integer> arr = test.printListFromTailToHead(l);
		System.out.println(arr);

	}
}
