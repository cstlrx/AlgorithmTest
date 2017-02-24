package io.lrx.AlgorithmStudy;

/**
 * @author lrx
 * @time 2016-12-9下午8:48:43
 */
// 八皇后
public class EightQueen {
	static int num = 4;// n皇后
	static int count = 1;
	static int[] result = new int[num];

	static void output() {
		System.out.println("第" + count++ + "个解：");
		for (int i = 0; i < num; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}

	static boolean judge(int row, int col) {
		boolean flag = false;
		for (int i = 0; i < row; i++) {
			if (result[i] == col) {// 在同一列
				flag = true;
				break;
			}
			if ((row - i) == (col - result[i])// 在同一斜线
					|| (row - i) == (result[i] - col)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// 从第0行开始深度遍历
	public static void queue(int row) {
		if (row == num) {
			output();
		} else {
			for (int i = 0; i < num; i++) {
				if (!judge(row, i)) {// 判断是否和前边的在一行一列或同一斜线上
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
