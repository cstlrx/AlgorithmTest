package swordToOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lrx on 2017/3/19.
 */

public class PrintMinNumberArray {
    // 实现一个比较器
    static Comparator c = new Comparator() {
        @Override
        public int compare(Object s1, Object s2) {
            return (((String)s1+(String)s2).compareTo((String)s2+(String)s1));
        }
    };
    public static String printMinNumber(int [] numbers) {
//        List<String> arr = new ArrayList<>();
        String[] array = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            array[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(array,c);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<array.length; i++) {
            sb.append(array[i]);
        }
//        System.out.println(array[0]);
//        System.out.println(array[1]);
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main (String[] args) {
        printMinNumber(new int[] {3,32,321});
    }
}
