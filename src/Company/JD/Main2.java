package Company.JD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lrx on 2017/4/7.
 */
public class Main2 {
    private static void combile(int n,int r){
        int i;
        for(i=n;i>=r;i--){
            a.add(i);
            if(r==1){
                double re = 1.0;
                for(int k=0; k<arr.length; k++) {
                    if (a.contains(k)) {
                        re *= arr[k] / 100;
                    } else {
                        re *= 1- (arr[k] / 100);
                    }
                }
                System.out.println(re);
                res += re;
                continue;
            }
            else
            combile(i-1,r-1);
        }
    }
    static ArrayList<Integer> a = new ArrayList<>();
    static double res = 0.0;
    static double[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            arr = new double[(int)n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int num = (int)Math.ceil(n * 6 / 10);
            for (int i=num; i<=n; i++) {
                combile((int)n,num);
            }
            System.out.println(res);
        }
    }

}

