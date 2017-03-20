package swordToOffer;

import java.util.HashMap;

/**
 * Created by lrx on 2017/3/19.
 */
// 第一个只出现一次的字符
public class FirstNotRepeatingChar {
    public static int firstNotRepeatingChar (String str){
        HashMap<Character, Integer> hash = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i=0; i<arr.length; i++) {
            if (hash.get(arr[i]) == null) {
                hash.put(arr[i], 1);
            }else {
                hash.put(arr[i],hash.get(arr[i])+1);
            }
        }
        for(int i=0; i<arr.length; i++) {
            if (hash.get(arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
