package sort;

/**
 * @author lrx
 * @time 2016-12-12обнГ9:50:40
 */
public class Selection {

	private static void exec(Comparable a[], int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private boolean less(Comparable a, Comparable b) {
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

	public static void sort(Comparable a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[min]) < 0) {
					min = j;
				}
			}
			exec(a, i, min);
		}
	}

	public static void main(String[] args) {
		String a[] = { "z", "b", "c", "d", "e" };
		sort(a);
		System.out.println(isSorted(a));
		assert isSorted(a);
		show(a);
	}
}
