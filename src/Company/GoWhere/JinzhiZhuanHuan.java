package Company.GoWhere;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lrx on 2017/4/1.
 */

public class JinzhiZhuanHuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            BigInteger res = BigInteger.ZERO;
            for(int i=0; i<arr.length; i++) {
                res = res.multiply(BigInteger.valueOf(26)).add(BigInteger.valueOf(charToInt(arr[i])));
            }
            System.out.println(res);
        }

    }
    private static int charToInt(char i) {
        return (i-'a');
    }
}
