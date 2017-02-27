package Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author lrx
 * @time 2017-2-25обнГ8:38:21
 */
public class TuZiDong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 10, b = 4, c = 5, d = 9;
		System.out.println(++a * b + c * --d);
		int x;
		int n;

		while (sc.hasNext()) {
			x = sc.nextInt();
			n = sc.nextInt();

			boolean[] flag = new boolean[21];

			int cur = x;
			flag[cur] = true;
			for (int i = 2; i <= n; i++) {
				cur = (cur + i) % 20;
				if (cur == 0)
					cur = 20;
				flag[cur] = true;
			}
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = 1; i < 21; i++) {
				if (flag[i] == false) {
					result.add(i);
				}
			}
			if (result.size() == 0) {
				System.out.println(-1);
				continue;
			}
			Collections.sort(result);
			for (Integer i : result) {
				if (i == result.get(result.size() - 1)) {
					System.out.print(i);
				} else
					System.out.print(i + " ");
			}
			System.out.println();
			System.out.println(1232414);
		}
	}
}
