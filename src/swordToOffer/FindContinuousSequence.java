package swordToOffer;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/3/20.
 */

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=1; i<=sum; i++) {
            for(int j=i+1; j<=sum; j++) {
                int curS = (i+j)*(j-i+1)/2;
                if(curS > sum)
                    break;
                if(curS == sum) {
                    ArrayList<Integer> arr = new ArrayList<>();
                    for(int k=i; k<=j; k++)arr.add(k);
                    result.add(arr);
                }
            }
        }
        return result;
    }
}
