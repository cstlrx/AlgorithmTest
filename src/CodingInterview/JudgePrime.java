package CodingInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lrx
 * @time 2016-11-22下午9:58:32
 */

public class JudgePrime {
	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num <= 1)
			return !flag;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	// 打印0-num之间的所有素数
	public static List<Integer> prime(int num) {
		List<Integer> l = new ArrayList<Integer>();
		if (num > 10000) {
			System.out.println("数字超过限制");
			return l;
		}
		boolean[] array = new boolean[100000];// 默认false,数组下标代表得数是否是素数，false代表是，为了不用初始化数组
		for (int i = 2; i <= num; i++) {
			if (!array[i]) {
				if (isPrime(i)) {
					l.add(i);
				} else {
					for (int j = i; j <= num; j += i) {// 若不是素数，则所有小于num的i的倍数都不是素数
						array[j] = true;
					}
				}
			}
		}

		// System.out.println(array[1]);
		// for (int i = 2; i < array.length && i<=num; i++) {
		// if(array[i]){
		// l.add(i);
		// }
		// }
		return l;
	}

	public static void main(String[] args) {
		// for (int i = 1; i < 5000; i++) {
		// if (isPrime(i)) {
		// System.out.print(i + " ");
		// }
		// }
		List<Integer> l = prime(10000);
		System.out.println(l);
		// System.out.println(isPrime(10000));

	}
}
