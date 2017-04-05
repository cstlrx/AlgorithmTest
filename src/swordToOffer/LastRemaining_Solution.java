package swordToOffer;

import java.util.LinkedList;

/**
 * Created by lrx on 2017/3/21.
 */

public class LastRemaining_Solution {
    public static int lastRemaining_Solution(int n, int m) {
        if (n == 1) return n-1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i<n; i++) {
            list.add(i);
        }
        int start = 0;
        while (list.size() > 1) {
            int toDel = (start+m-1) % list.size();

            if (toDel == list.size()-1) start = 0;
            else start = toDel;
            list.remove(toDel);
        }
        return list.get(0);
    }
    public static void main (String[] args) {
        int res = lastRemaining_Solution(5,3);
        System.out.println(res);
    }
}
