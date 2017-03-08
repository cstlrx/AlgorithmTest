package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-15����12:39:14
 */
/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳�� ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�����֤������������
 * ż����ż��֮������λ�ò��䡣
 */
public class OddEvenArray {

	public static void reOrderArray(int[] array) {
		int length = array.length;
		if (length == 0 || length == 1)
			return;

		int start = 0;
		while (array[start] % 2 != 0) {
			start++;// startָ���һ��ż��
			if (start == length)
				return;
		}
		int oddP = start + 1;
		while (oddP < length) {
			while (array[oddP] % 2 == 0) {
				oddP++;// ʹoddPָ������
				if (oddP == length)
					break;
			}
			if (oddP < length) {
				int odd = array[oddP];
				for (int i = oddP - 1; i >= start; i--) {
					array[i + 1] = array[i];
				}
				array[start] = odd;
				while (array[start] % 2 != 0)
					start++;
				oddP = start + 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray(array);
	}

}
