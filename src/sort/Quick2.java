package sort;

import java.util.Random;

/**
 * @author lrx
 * @time 2017-2-26下午2:40:31
 */
public class Quick2 {
	public static void sort(Comparable[] array) {
		sort(array, 0, array.length - 1);
	}

	private static void sort(Comparable[] array, int start, int end) {
		if (end <= start)
			return;

		int index = partition(array, start, end);
		sort(array, start, index - 1);
		sort(array, index + 1, end);
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	// 交换
	private static void exec(Comparable a[], int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	/*
	 * 切分数组
	 */
	private static int partition(Comparable[] array, int start, int end) {
		int l = start, r = end + 1;
		int index = rand(start, end);
		exec(array, start, index);
		Comparable v = array[0];
		while (true) {
			while (less(array[++l], v))
				if (l == end) {
					break;
				}
			while (less(v, array[--r]))
				if (r == start)
					break;
			if (r <= l)
				break;
			exec(array, l, r);
		}
		exec(array, start, r);

		return r;
	}

	/*
	 * 返回st-end之间的一个随机数
	 */
	private static int rand(int st, int end) {
		if (st > end) {
			return 0;
		}
		Random rand = new Random();
		int r = rand.nextInt((end - st + 1)) + 1;
		return (st - 1) + r;
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[] { 1, 2, 6, 4 };
		sort(a);

		Insertion.show(a);
	}
}
