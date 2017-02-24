package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2017-2-22����5:56:15
 */
public class VerifySquenceOfBST {
	/*
	 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ���� ����������Yes,�������No���������������������������ֶ�������ͬ��
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
