package Company;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/19.
 */

public class Main319 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int offset = sc.nextInt();
            int n = sc.nextInt();
            int len1 = sc.nextInt();
            int len2 = sc.nextInt();

            if ((offset + n) >= (len1 + len2)){
                if (offset < len1) {
                    System.out.println(offset + " " + len1 + " " + 0 + " " + len2);
                }else if (offset >= len1 && offset < (len1+len2)){
                    System.out.println(len1 + " " + len1 + " " + (offset-len1) + " " +len2);
                } else {
                    System.out.println(len1 + " " + len1 + " " + len2 + " " + len2);
                }
            }else {
//                if (offset < len1) {
//                    int l = (offset+n)>len1?len1:len1-(offset+n);
//                    System.out.println(offset + " " + l + " " + len2 + " " + len2);
//                }else if (offset > len1 && offset < (len1+len2)){
//
//                }
            }
        }
    }
}
