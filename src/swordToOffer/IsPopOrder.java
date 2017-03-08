package swordToOffer;

import java.util.Stack;

/**
 * @author lrx
 * @time 2017-2-22обнГ3:35:19
 */
public class IsPopOrder {
	public static boolean ispopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0)
			return true;
		boolean flag = false;
		Stack<Integer> s = new Stack<Integer>();
		int pushP = 0;
		int popP = 0;
		s.push(pushA[pushP++]);
		// while (pushP != pushA.length) {
		// while (s.peek() != popA[popP] && pushP < pushA.length)
		// s.push(pushA[pushP++]);
		// if (pushP == pushA.length) {
		// flag = false;
		// break;
		// }
		// s.pop();
		// popP++;
		// }

		while (true) {
			if (s.peek() == popA[popP]) {
				s.pop();
				popP++;
			} else {
				if (pushP == pushA.length) {
					flag = false;
					break;
				}
				s.push(pushA[pushP++]);
			}
			if (pushP == pushA.length && s.isEmpty()) {
				flag = true;
				break;
			}
			if (s.peek() != popA[popP] && pushP == pushA.length) {
				flag = false;
				break;
			}

		}

		return flag;
	}

	public static void main(String[] args) {
		ispopOrder(new int[] { 1 }, new int[] { 2 });
	}
}
