package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author lrx
 * @time 2017-2-26обнГ12:22:48
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (sc.hasNext()) {
			array.add(sc.nextInt());
		}
		int k = array.get(array.size() - 1);

		array.remove(array.size() - 1);
		Collections.sort(array);
		for (int i = 0; i < k; i++) {
			System.out.print(array.get(i));
		}
	}
}
