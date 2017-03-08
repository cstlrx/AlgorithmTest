package sort;

/**
 * @author lrx
 * @time 2017-2-26下午4:19:45
 */
public class Bubble {
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

	public static void sort(Comparable[] array) {

		for (int i = array.length - 1; i >= 1; i--) {// 冒泡到数组的i位置
			for (int j = 0; j < i; j++) {// 从J开始冒
				if (less(array[j + 1], array[j]))
					exec(array, j, j + 1);
			}
		}
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 6, 5, 4, 3, 2, 1, 0, 9, 8, 7 };
		sort(array);
		show(array);
	}
}
