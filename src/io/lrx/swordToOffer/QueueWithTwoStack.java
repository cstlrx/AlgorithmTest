package io.lrx.swordToOffer;

import java.util.Stack;

/**
 * @author lrx
 * @time 2016-11-7����4:15:49
 */
/*
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
/*
 * ˼·һ������ջ��һ��������pushʱ�����ݣ���popʱ���Ƚ�ջһ�е�Ԫ�����ν���ջ2��popһ��Ԫ�أ�
 * �⽫��ջ1��Ͷ˵�Ԫ�أ������½�ջ2��Ԫ��push��ջ1 �����ԣ��൱������
 * ˼·2��ÿ��ֻ�е�ջ2Ϊ��ʱ�Ž�ջ1�е�Ԫ�ط���ջ2�У�pushʱ�ŵ�ջ1�У�popʱֱ�Ӵ�ջ2���ü��ɡ� ����ľ�Ȼ����������ʦ�Ľⷨһ��
 */
public class QueueWithTwoStack {
	class Solution {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		public void push(int node) {
			stack1.push(node);
		}

		public int pop() { // ÿ�γ�ջ֮ǰ��ջ1Ԫ���Ⱦ���ջ2���� while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());

			int popEle = stack2.pop(); //
			// �ٽ�ջ2pop���Ԫ�����·���ջ1
			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			return popEle;
		}
		// ˼·2
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
