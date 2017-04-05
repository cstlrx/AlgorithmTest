package swordToOffer;

import java.util.HashSet;

/**
 * Created by lrx on 2017/3/31.
 */

public class DuplicateNumber {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean flag = false;
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<length; i++) {
            if(hash.contains(numbers[i])){
                duplication[0] = numbers[i];
                flag = true;
                break;
            } else {
                hash.add(numbers[i]);
            }
        }
        return flag;
    }
}
