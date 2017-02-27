package Company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lrx
 * @time 2017-2-26下午12:39:41
 */
// 输入n个整数，输出出现次数大于等于数组长度一半的数。
public class FindArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (sc.hasNext()) {
			array.add(sc.nextInt());
		}
		int cur = array.get(0);
		int num = 1;
		for (int i = 1; i < array.size(); i++) {
			if (array.get(i) != cur) {
				num--;
				if (num == 0) {
					cur = array.get(i);
					num = 1;
				}
			} else {
				num++;
			}
		}
		System.out.println(cur);

	}
}
