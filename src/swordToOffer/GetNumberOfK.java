package swordToOffer;

import java.util.Arrays;

/**
 * Created by lrx on 2017/3/20.
 */

public class GetNumberOfK {
    public int getNumberOfK(int [] array , int k) {
        Arrays.sort(array);

        int count = 0;
        for (int i=0; i<array.length; i++) {
            if(array[i] == k) {
                count++;
            }
        }
        return count;
    }
}
