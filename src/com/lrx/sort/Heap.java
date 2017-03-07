package com.lrx.sort;

/**
 * Created by lrx on 2017/3/7.
 */
// ����
public class Heap {
    /**
     *  �Ƚ�����Ԫ�صĴ�С
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
    // �ϸ�,������û�õ�
//    private void swim(int k){
//        while (k > 1){
//            if(less(k/2,k)) {
//                exec(k, k/2);
//            }
//            k = k/2;
//        }
//    }
    // �³����������µ�����
    private static void sink(Comparable[] array, int k, int N){

        // ���ӽڵ��е����ֵ�Ƚϣ���С�ڽ���
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
        // ���������Ϊ����
        for (int i=N/2; i>=1; i--) {
            sink(array, i, N);
        }
        // ������������飬�����������Ϊ��С�����˳��
        // ���ν����ĶѶ�����������ĩβ
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
