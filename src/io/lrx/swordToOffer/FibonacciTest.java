package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2016-11-6下午1:42:41
 */
/*
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。 n<=39
 */
/*
 * 使用递归浪费太大
 */
// 使用数组，没有必要，因为我们需要的只是一个数而已
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
	 * 定义三个变量，分别表示当前，上一个，上上一个元素。
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
