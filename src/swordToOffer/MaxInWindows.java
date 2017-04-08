package swordToOffer;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/4/8.
 */
 /*
 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
  */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if (size > num.length || size<=0) return res;
        int l = 0;
        int r = size-1;
        int max = num[l];
        for (int i=l; i<=r; i++) {
            if (num[i] > max)
                max = num[i];
        }
        res.add(max);
        while (r < num.length-1) {
            l++;
            r++;
            if (num[l-1] == max) {
                max = Integer.MIN_VALUE;
                for (int i=l; i<=r; i++) {
                    if (num[i] > max)
                        max = num[i];
                }
            } else {
                if (num[r] > max)
                    max = num[r];
            }
            res.add(max);
        }
        return res;
    }
}
