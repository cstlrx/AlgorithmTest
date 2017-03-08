package CodingInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lrx
 * @time 2016-11-22����9:58:32
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

	// ��ӡ0-num֮�����������
	public static List<Integer> prime(int num) {
		List<Integer> l = new ArrayList<Integer>();
		if (num > 10000) {
			System.out.println("���ֳ�������");
			return l;
		}
		boolean[] array = new boolean[100000];// Ĭ��false,�����±��������Ƿ���������false�����ǣ�Ϊ�˲��ó�ʼ������
		for (int i = 2; i <= num; i++) {
			if (!array[i]) {
				if (isPrime(i)) {
					l.add(i);
				} else {
					for (int j = i; j <= num; j += i) {// ������������������С��num��i�ı�������������
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
