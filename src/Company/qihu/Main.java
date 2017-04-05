package Company.qihu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lrx on 2017/3/18.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i=1; i<=T; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
//            ArrayList<Integer> array = new ArrayList<>();
            for (int j=0; j<n; j++){
                array[j] = sc.nextInt();
            }
            int l=0, r = n-1;
            int sumA=0, sumB=0;
            boolean flag = true;
            while (l < r) {
                if(flag) {
                    if (array[l] >= array[r]) {
                        sumA += array[l++];
                    } else {
                        sumA += array[r--];
                    }
                    if (array[l] >= array[r]) {
                        sumB += array[l++];
                    } else {
                        sumB += array[r--];
                    }
                    flag = false;
                } else {
                    if (array[l] >= array[r]) {
                        sumB += array[l++];
                    } else {
                        sumB += array[r--];
                    }
                    if (array[l] >= array[r]) {
                        sumA += array[l++];
                    } else {
                        sumA += array[r--];
                    }
                    flag = true;
                }
            }

            System.out.println("Case #" + i +": " + sumA + " " + sumB);

        }
        //Case #1: 18 11
        //Case #1: 11 18

        {
//            DecimalFormat df = new DecimalFormat("#.###");
//            while (sc.hasNext()) {
//                int L = sc.nextInt();
//                int R = sc.nextInt();
//                double x = 0;
//                double y = 0;
//                double zhou = Math.PI * 2 * R;
//                double s = L % (zhou);
//
//                x = Math.cos(s / R) * R;
//                  y = Math.sin(s / R) * R;
//
//                System.out.println(df.format(x) + " " + df.format(-y));
//                System.out.println(df.format(x) + " " + df.format(y));

        }

    }

}
