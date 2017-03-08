package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-23����4:41:30
 */
class RandomListNode0 {
	int label;
	RandomListNode0 next = null;
	RandomListNode0 random = null;

	RandomListNode0(int label) {
		this.label = label;
	}
}

public class RandomListNode {
	public static RandomListNode0 Clone(RandomListNode0 pHead) {
		if (pHead == null)
			return null;

		// �¶�Ϊ��ÿ���ڵ㸴�ƺ�������ԭ���ڵ��
		RandomListNode0 r = pHead;
		while (r != null) {
			RandomListNode0 clo = new RandomListNode0(r.label);
			clo.next = r.next;
			clo.random = null;

			r.next = clo;
			r = clo.next;
		}
		// ����ָ�봦��
		r = pHead;
		while (r != null) {
			if (r.random != null)
				r.next.random = r.random.next;// r�Ŀ�¡�ڵ��randomָ��r��random�Ŀ�¡
			r = r.next.next;
		}
		// �ֽ�����
		RandomListNode0 result = pHead.next;
		RandomListNode0 tail = pHead.next;
		while (tail != null) {
			if (tail.next != null)
				tail.next = tail.next.next;

			tail = tail.next;
		}
		return result;
	}

	public static void main(String[] args) {
		RandomListNode0 r = new RandomListNode0(1);
		r.next = new RandomListNode0(2);
		r.next.next = new RandomListNode0(3);
		RandomListNode0 v = Clone(r);
		System.out.println(v.next.label);
	}
}
