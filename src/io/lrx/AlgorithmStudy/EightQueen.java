package io.lrx.AlgorithmStudy;

/**
 * @author lrx
 * @time 2016-12-9����8:48:43
 */
// �˻ʺ�
public class EightQueen {
	static int num = 4;// n�ʺ�
	static int count = 1;
	static int[] result = new int[num];

	static void output() {
		System.out.println("��" + count++ + "���⣺");
		for (int i = 0; i < num; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}

	static boolean judge(int row, int col) {
		boolean flag = false;
		for (int i = 0; i < row; i++) {
			if (result[i] == col) {// ��ͬһ��
				flag = true;
				break;
			}
			if ((row - i) == (col - result[i])// ��ͬһб��
					|| (row - i) == (result[i] - col)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// �ӵ�0�п�ʼ��ȱ���
	public static void queue(int row) {
		if (row == num) {
			output();
		} else {
			for (int i = 0; i < num; i++) {
				if (!judge(row, i)) {// �ж��Ƿ��ǰ�ߵ���һ��һ�л�ͬһб����
					result[row] = i;
					queue(row + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		queue(0);
	}
}
