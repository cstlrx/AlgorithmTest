package sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author lrx
 * @time 2017-1-20ÏÂÎç3:51:20
 */
public class Quick {
	public static void sort(Comparable[] a) {
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi)
			return;
		// if (hi - lo <= 10)
		// Insertion.sort(a, lo, hi);
		int j = partition(a, lo, hi); // ÇÐ·ÖÔªËØ
		sort(a, lo, j - 1);
		sort(a, j + 1, hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		Comparable v = a[lo];
		while (true) {
			while (Insertion.less(a[++i], v))
				if (i == hi)
					break;
			while (Insertion.less(v, a[--j]))
				if (j == lo)
					break;
			if (i >= j)
				break;
			Insertion.exec(a, i, j);
		}
		Insertion.exec(a, lo, j);
		return j;
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[100];
		for (int i = 0; i < 100; i++)
			a[i] = (int) StdRandom.uniform(1000);
		Insertion.show(a);
		sort(a);
		Insertion.show(a);
	}
}
