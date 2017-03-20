package swordToOffer;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/3/20.
 */
// 找到递增排序数组中和为某值积最小的数
// 定义两个指针
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {

        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) return res;

        int mul = Integer.MAX_VALUE;
        int resX = 0,resY = 0;
        int l = 0;
        int r = array.length-1;
        while (l < r) {
            if ( (array[l]+array[r]) == sum) {
                if((array[l]*array[r]) < mul) {
                    mul = array[l] * array[r];
                    resX = array[l];
                    resY = array[r];
                }
                r--;
            } else if ((array[l]+array[r]) > sum) {
                r--;
            } else {
                l++;
            }
        }
        if(mul == Integer.MAX_VALUE) {
            return res;
        }
        res.add(resX);
        res.add(resY);
        return res;
    }
}
