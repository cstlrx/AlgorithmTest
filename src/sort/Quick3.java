package sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by lrx on 2017/3/18.
 */

public class Quick3 {
    public static void sort(int[] array) {
        sort(array, 0, array.length-1);
    }
    private static void sort(int[] array, int lo, int hi) {
        if(hi <= lo) return;
        int index = partition(array, lo, hi);
        sort(array, lo, index - 1);
        sort(array, index + 1, hi);
    }
    private static int partition(int[] array, int lo, int hi ) {
        int v = array[lo];
        int l = lo, r = hi + 1;

        while(l <= r) {
            while(array[++l] < v) if(l == hi) break;
            while(array[--r] > v) if(r == lo) break;
            if (l >= r) break;
            exec(array, l, r);
        }
        //if (l == hi)  l = l+1;
        exec (array, lo, r);
        return r;
    }
    private static void exec (int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++)
            a[i] = (int) StdRandom.uniform(1000);
//        for (int i=0; i<a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
        //System.out.println();
        sort(a);

        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
