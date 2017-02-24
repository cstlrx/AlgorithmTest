package com.lrx.sort;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author lrx
 * @time 2016-12-19下午9:42:25
 */
// 算法比较
public class SortCompare {
	public static double time(String arg, Double[] a) {
		Stopwatch timer = new Stopwatch();// 计算用时
		if (arg.equals("Insertion"))
			Insertion.sort(a);
		if (arg.equals("Selection"))
			Selection.sort(a);
		if (arg.equals("Shell"))
			Shell.sort(a);
		if (arg.equals("Merge"))
			Merge.sort(a);
		if (arg.equals("Quick"))
			Insertion.sort(a);
		if (arg.equals("Insertion"))
			Insertion.sort(a);
		return timer.elapsedTime();
	}

	public static double timeRandomInput(String arg, int N, int T) {
		double total = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				a[i] = StdRandom.uniform();
			}
			total += time(arg, a);
		}
		System.out.println(total + arg + "");

		return total;
	}

	public static void main(String[] args) {
		String arg1 = args[0];
		String arg2 = args[1];
		int N = Integer.parseInt(args[2]);
		int T = Integer.parseInt(args[3]);
		double t1 = timeRandomInput(arg1, N, T);
		double t2 = timeRandomInput(arg2, N, T);
		System.out.println("For " + N + " random Doubles");
		System.out.println(arg1 + "is " + t2 / t1 + " times faster than "
				+ arg2);
	}

}

class A {
	public static void main(String[] args) {
		String[] a = { "Quick", "Merge", "10000", "120" };
		// SortCompare.main(new String[2]);
		SortCompare sc = new SortCompare();
		sc.main(a);
	}
}
