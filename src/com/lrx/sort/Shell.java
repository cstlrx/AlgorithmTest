package com.lrx.sort;

/**
 * @author lrx
 * @time 2016-12-19обнГ8:23:00
 */
public class Shell {
	private static void exec(Comparable a[], int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void show(Comparable a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static boolean isSorted(Comparable a[]) {
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i].compareTo(a[i + 1]) > 0)
				flag = false;
		}
		return flag;
	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;
		while (h >= 1) {
			for (int i = h; i < N; i++)
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exec(a, j, j - h);
				}
			h = h / 3;
		}
	}

	public static void main(String[] args) {

	}
}
