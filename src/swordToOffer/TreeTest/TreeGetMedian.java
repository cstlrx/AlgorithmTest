package swordToOffer.TreeTest;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by lrx on 2017/4/8.
 */
public class TreeGetMedian {
    public static void main(String[] args) {
        Insert(5);
        System.out.println(GetMedian());
        Insert(2);
        System.out.println(GetMedian());
        Insert(3);
        System.out.println(GetMedian());
    }
    private static ArrayList<Integer> arr = new ArrayList<>();
    public static void Insert(Integer num) {
        arr.add(num);
    }

    public static Double GetMedian() {
        if (arr.size() == 0) return 0.0;
        TreeSet<Integer> tree = new TreeSet<>();
        int len = arr.size() / 2 + 1;
        for (int i=0; i<arr.size(); i++) {
            if (tree.size() == len) {
                if (tree.last() > arr.get(i)) {
                    tree.remove(tree.last());
                    tree.add(arr.get(i));
                }
            } else {
                tree.add(arr.get(i));
            }
        }
        double res = 0;
        if (arr.size() % 2 == 0) {
            int fir = tree.last();
            tree.remove(fir);
            return (double)(tree.last()+fir)/2;
        }
        return (double)tree.last();
    }
}
