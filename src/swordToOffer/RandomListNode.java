package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-23下午4:41:30
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

		// 下段为将每个节点复制后连接在原来节点后
		RandomListNode0 r = pHead;
		while (r != null) {
			RandomListNode0 clo = new RandomListNode0(r.label);
			clo.next = r.next;
			clo.random = null;

			r.next = clo;
			r = clo.next;
		}
		// 特殊指针处理
		r = pHead;
		while (r != null) {
			if (r.random != null)
				r.next.random = r.random.next;// r的克隆节点的random指向r的random的克隆
			r = r.next.next;
		}
		// 分解链表
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
