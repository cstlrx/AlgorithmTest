package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2016-11-6����1:42:41
 */
/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n� n<=39
 */
/*
 * ʹ�õݹ��˷�̫��
 */
// ʹ�����飬û�б�Ҫ����Ϊ������Ҫ��ֻ��һ��������
//
public class FibonacciTest {
	// public static int Fibonacci(int n) {
	// if (n == 1 || n == 2) {
	// return 1;
	// }
	// return Fibonacci(n - 1) + Fibonacci(n - 2);
	//
	// }
	// public static int Fibonacci(int n) {
	// if(n==0){
	// return 0;
	// }
	// if(n==1 || n==2){
	// return 1;
	// }
	// int[] array = new int[n];
	// array[0] = 1;
	// array[1] = 1;
	// for (int i = 2; i < n; i++) {
	// array[i] = array[i - 1] + array[i - 2];
	// }
	// return array[n - 1];
	//
	// }
	/*
	 * ���������������ֱ��ʾ��ǰ����һ��������һ��Ԫ�ء�
	 */
	public static int Fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		int lastlast = 0, last = 1, now = 1;
		for (int i = 3; i <= n; i++) {
			lastlast = last;
			last = now;
			now = lastlast + last;
		}
		return now;

	}

	public static void main(String[] args) {
		System.out.println(Fibonacci(39));
	}
}
