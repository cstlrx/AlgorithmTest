package swordToOffer;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/3/19.
 */

public class GetUglyNumber_Solution {
    public static int getUglyNumber_Solution(int index) {
        if (index <= 0)
            return 0;
        int[] arr = new int[index];
        arr[0] = 1;
        for (int i=1; i<index; i++) {
            int curMax = arr[i-1];
            int m = 1;
            for (int j=0; j<=i; j++) {
                m = arr[j] * 2;
                if(m > curMax) {
                    break;
                }
            }
            int min = m;
            m = 1;
            for (int j=0; j<=i; j++) {
                m = arr[j] * 3;
                if(m > curMax) {
                    break;
                }
            }
            if (m < min) min = m;
            m = 1;
            for (int j=0; j<=i; j++) {
                m = arr[j] * 5;
                if(m > curMax) {
                    break;
                }
            }
            if (m < min) min = m;
            arr[i] = min;

        }
        System.out.print(arr[9]);
        return arr[index-1];
    }
    public static void main(String[] args) {
        getUglyNumber_Solution(10);
    }
}
