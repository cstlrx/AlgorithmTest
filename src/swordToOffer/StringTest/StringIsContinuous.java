package swordToOffer.StringTest;

import java.util.Arrays;

/**
 * Created by lrx on 2017/4/8.
 */
public class StringIsContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length == 0) return false;
        Arrays.sort(numbers);
        int num0 = 0;
        int i;
        for(i=0; i<numbers.length; i++) {
            if (numbers[i] == 0)
                num0++;
            else if (numbers[i] > 0)
                break;
            else
                return false;
        }
        boolean res = true;
        while (i < numbers.length-1) {
            int d = numbers[i+1] - numbers[i];
            if (d <= 0) return false;
            while (d > 1) {
                if (num0 == 0)
                    return false;
                num0--;
                d--;
            }
            i++;
        }
        return res;
    }
}
