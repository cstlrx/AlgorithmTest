package com.lrx.sort;

/**
 * @author lrx
 * @time 2016-12-20下午8:43:52
 */
public class Merge {
	private static Comparable[] aux;// 归并需要的数组,一次定义,多次使用

	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
	}

	// 归并两个有序数组
	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		for (int i = lo; i < hi; i++) {
			aux[i] = a[i];
		}
		int l = lo;
		int r = mid + 1;
		for (int i = lo; i < hi; i++) {
			if (l > mid)
				aux[i] = a[r++];
			else if (r > hi)
				aux[i] = a[l++];
			else if (less(a[l], a[r]))
				aux[i] = a[l++];
			else
				aux[i] = a[r++];
		}
	}
}
