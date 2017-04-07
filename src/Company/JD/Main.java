package Company.JD;

import java.util.Scanner;

/**
 * Created by lrx on 2017/4/7.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String N = sc.nextLine();
            int n = Integer.parseInt(N);
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            boolean[] flag1 = new boolean[arr.length];
           // boolean[] flag2 = new boolean[arr.length];
            for (int i=0; i<arr.length; i++) {
                // 警察
                if (Character.isDigit(arr[i])) {
                    int j = i;
                    for (int k=1; k<=arr[i]-'0'; k++) {
                        if (j-k < 0) break;
                        flag1[j-k] = true;
//                        if (flag1[j-k]) {
//                            flag2[j-k] = true;
//                        } else {
//                            flag1[j-k] = true;
//                        }
                    }
                    j = i;
                    for (int k=1; k<=arr[i]-'0'; k++) {
                        if (j+k >= arr.length) break;
                        flag1[j+k] = true;
//                        if (flag1[j+k]) {
//                            flag2[j+k] = true;
//                        } else {
//                            flag1[j+k] = true;
//                        }
                    }
                }
            }
            int res = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i] == 'X') {
                    if (flag1[i]){
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
