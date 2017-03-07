package com.lrx.sort;

/**
 * @author lrx
 * @time 2017-2-26����5:00:25
 */
public class Selection2 {
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
        System.out.print(22);

	}

	public static void sort(Comparable[] array) {

		int min;
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (less(array[j], array[min])) {
					min = j;
				}
			}
			exec(array, i, min);
		}
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 6, 5, 4, 3, 2, 1, 0, 9, 8, 7 };
		sort(array);
		show(array);
	}
}
