package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2017-2-22下午5:56:15
 */
public class VerifySquenceOfBST {
	/*
	 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
	 */
	boolean result = false;

	public boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence.length == 0)
			return false;
		if (sequence.length == 1)
			return true;

		result = VerifySquenceOfBST(sequence, 0, sequence.length - 1);
		return result;
	}

	public static boolean VerifySquenceOfBST(int[] sequence, int start, int end) {
		if (end <= start)
			return true;

		int root = sequence[end];
		int index = start;
		while (sequence[index] < root) {
			index++;
			if (index == end)
				break;
		}
		for (int i = index; i < end; i++) {
			if (sequence[i] < root)
				return false;
		}
		if (VerifySquenceOfBST(sequence, start, index - 1)
				&& VerifySquenceOfBST(sequence, index, end - 1)) {
			return true;
		}
		return false;
	}
}
