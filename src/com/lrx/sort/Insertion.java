package com.lrx.sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author lrx
 * @time 2016-12-12ÏÂÎç10:14:12
 */
public class Insertion {
	public static void exec(Comparable a[], int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static void show(Comparable a[]) {
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

	public static void sort(Comparable a[]) {
		int cur;
		for (int i = 1; i < a.length; i++) {
			for (cur = i; cur > 0 && less(a[cur], a[cur - 1]); cur--) {
				exec(a, cur, cur - 1);
			}
		}
	}

	public static void sort(Comparable a[], int lo, int hi) {
		int cur;
		for (int i = lo + 1; i < hi + 1; i++) {
			for (cur = i; cur > 0 && less(a[cur], a[cur - 1]); cur--) {
				exec(a, cur, cur - 1);
			}
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[100];
		for (int i = 0; i < 100; i++)
			a[i] = (int) StdRandom.uniform(1000);
		sort(a);
		show(a);

	}
}
