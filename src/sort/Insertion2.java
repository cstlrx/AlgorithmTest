package sort;

/**
 * @author lrx
 * @time 2017-2-26ÏÂÎç4:30:05
 */
public class Insertion2 {
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

	private static boolean isSorted(Comparable a[]) {
		boolean flag = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i].compareTo(a[i + 1]) > 0)
				flag = false;
		}
		return flag;
	}

	public static void sort(Comparable[] array) {

		for (int i = 1; i < array.length; i++) {
			Comparable t = array[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (less(t, array[j])) {
					exec(array, j, j + 1);
				} else {
					// array[j + 1] = t;
					break;
				}
			}
			array[j + 1] = t;
		}
		System.out.println(isSorted(array));
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 33, 45, 4, 3, 2, 1, 0, 9, 8, 7 };
		sort(array);
		show(array);
	}
}
