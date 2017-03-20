package swordToOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by lrx on 2017/3/20.
 */
// 判断一个数组中只出现一次的两个数字
public class FindNumsAppearOnce {
//    时间复杂度O(N) 空间O（N）
    public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 1){
            num1[0] = array[0];
            num2[0] = array[0];
        }
        if(array.length == 2){
            num1[0] = array[0];
            num2[0] = array[1];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<array.length; i++) {
            if(!set.contains(array[i])) {
                set.add(array[i]);
            } else {
                set.remove(array[i]);
            }
        }
        Object[] arr = set.toArray();
        num1[0] = (int)arr[0];
        num2[0] = (int)arr[1];
    }
    private static int getBit(int num, int n) {
        return  (1<<n & num)!=0 ? 1 : 0;
    }
    //    时间复杂度O(N) 空间O（1）利用异或
    public static void findNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
        int r = 0;
        for(int i=0; i<array.length; i++) {
            r ^= array[i];
        }
        int n = 0;// 找到最低位为1的n
        while(true) {
            if (getBit(r,n) != 0) {
                break;
            }
            n++;
        }
//        int n1 = 0;
//        int n2 = 0;
        for(int i=0; i<array.length; i++) {
            if(getBit(array[i],n) == 1) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        findNumsAppearOnce2(arr,num1,num2);
        System.out.println (num1[0]);
        System.out.println (num2[0]);
//        System.out.println (getBit(7,1));
//        System.out.println (getBit(6,5));
    }
}
