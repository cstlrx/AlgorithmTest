package io.lrx.swordToOffer;

import java.util.Stack;

/**
 * @author lrx
 * @time 2016-11-7下午4:15:49
 */
/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
/*
 * 思路一：两个栈，一个用来在push时存数据，在pop时，先将栈一中的元素依次进入栈2，pop一个元素，
 * 这将是栈1最低端的元素，再重新将栈2的元素push进栈1 很明显，相当繁琐。
 * 思路2：每次只有当栈2为空时才将栈1中的元素放入栈2中，push时放到栈1中，pop时直接从栈2中拿即可。 乱想的竟然发现与左老师的解法一样
 */
public class QueueWithTwoStack {
	class Solution {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		public void push(int node) {
			stack1.push(node);
		}

		public int pop() { // 每次出栈之前将栈1元素先经过栈2反向 while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());

			int popEle = stack2.pop(); //
			// 再将栈2pop后的元素重新放入栈1
			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			return popEle;
		}
		// 思路2
		// int count = 0;

		// public void push(int node) {
		// stack1.push(node);
		// // count++;
		// }
		//
		// public int pop() {
		// if (!stack2.isEmpty()) {
		// // count--;
		// return stack2.pop();
		// } else {
		// while (!stack1.isEmpty()) {
		// stack2.push(stack1.pop());
		// // count--;
		// }
		// return stack2.pop();
		// }

		// }
	}

	public static void main(String[] args) {
		QueueWithTwoStack q = new QueueWithTwoStack();
		Solution s = q.new Solution();
		s.push(1);
		s.push(2);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
