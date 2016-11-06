package io.lrx.swordToOffer;

import java.util.ArrayList;

/**
 * @author lrx
 * @time 2016-11-6����10:08:51
 */
/*
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ�� ��������: ����Ϊ����ı�ͷ
 * 
 * �������: ���Ϊ��Ҫ��ӡ�ġ��������ı�ͷ
 */
/*
 * 1������ֱ����ջ��������ջ��������ջ�� 2���ݹ�
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
		 * ��������ʹ��ͷ�巨
		 */
		// System.out.println(listNode.val);// 7
		// System.out.println(listNode.next.val);// 3
		// System.out.println(listNode.next.next);// null
		while (listNode != null) {
			if (head == null) {
				head = listNode;
				// �տ�ʼû����������У�����headָ���Լ����γ���ѭ��
				listNode = listNode.next;
				// ����������仹����ѭ��
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
		// ��ͺ������ˣ��ѵ�����Ĭ��Ϊnull��
		/*
		 * �������ú������
		 */
		ArrayList<Integer> result = new ArrayList<Integer>();
		// result.add(5);
		/*
		 * ��������쳣
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
