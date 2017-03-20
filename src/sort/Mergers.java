package sort;

import edu.princeton.cs.algs4.StdRandom;



/**
 * Created by lrx on 2017/3/18.
 */

public class Mergers {
    private static int[] m_array = null;
    public static void sort (int[] array) {
        m_array = new int[array.length];
        sort (array, 0, array.length-1);
    }
    private static void sort (int[] array, int start, int end) {
        if (start >= end) return;
        int mid = start + (end-start) / 2;
        sort (array, start, mid);// 注意的地方，若此处为mid-1，两个元素的话会产生递归
        sort (array, mid+1, end);// 注意的地方，若此处为mid，两个元素会产生递归
        merge (array, start, mid, end);
    }
    private static void merge (int[] array, int start, int mid, int end) {
        int l = start, r = mid+1, index = start;
        for (int i=start; i<=end; i++) m_array[i] = array[i];
        while (l <= mid || r <= end) {
            if (l > mid) array[index++] = m_array[r++];
            else if (r > end) array[index++] = m_array[l++];
            else if (m_array[l] < m_array[r]) array[index++] = m_array[l++];
            else array[index++] = m_array[r++];
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,0,10,4534,8,4365,9};
//        for (int i = 0; i < 100; i++)
//            a[i] = (int) StdRandom.uniform(1000);
//        for (int i=0; i<a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
        //System.out.println();
        sort(a);
        System.out.println(isSorted(a));
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static boolean isSorted(int a[]) {
        boolean flag = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                flag = false;
        }
        return flag;
    }
}


