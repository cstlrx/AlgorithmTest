package com.lrx.sort;

/**
 * Created by lrx on 2017/3/7.
 */
// 堆排
public class Heap {
    /**
     *  比较两个元素的大小
     * @param array
     * @param i
     * @param j
     * @return
     */
    public static boolean less(Comparable array[], int i, int j){
        return array[i].compareTo(array[j]) < 0;
    }
    public static void exec(Comparable array[], int i, int j) {
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    // 上浮,在这里没用到
//    private void swim(int k){
//        while (k > 1){
//            if(less(k/2,k)) {
//                exec(k, k/2);
//            }
//            k = k/2;
//        }
//    }
    // 下沉，从上往下调整堆
    private static void sink(Comparable[] array, int k, int N){

        // 和子节点中的最大值比较，若小于交换
        while(2*k <= N) {
            int j = 2 * k;
            if(j<N && less(array, j, j+1))
                j++;
            if(!less(array,k,j))
                break;
            exec(array,k,j);
            k = j;
        }
    }
    public static void sort(Comparable[] array) {
        int N = array.length-1;
        // 将数组调整为最大堆
        for (int i=N/2; i>=1; i--) {
            sink(array, i, N);
        }
        // 拆掉堆排序数组，并将数组调整为从小到大的顺序
        // 依次将最大的堆顶调整到数组末尾
        while (N > 1) {
            exec(array, 1, N--);
            sink(array,1, N);
        }

    }
    public static void main(String[] args) {
        Integer[] array = new Integer[]{0,1,2,3,4};

        sort(array);
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
