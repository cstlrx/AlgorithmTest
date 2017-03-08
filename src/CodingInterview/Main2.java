package CodingInterview;
/**
 * Created by lrx on 2017/3/7.
 */

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/7.
 */

public class Main2 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        boolean flag = false;
        int q = 0;
        int p;
        for(p=2; p<=Math.sqrt(n) && !flag; p++) {
            if(isPrime(p)){
                q = 0;
                double t = n;
                while(t % p == 0) {
                    q++;
                    t = t/p;
                    if(t == 1) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        p--;
        if (flag){
            System.out.println(p + " " + q);
        }else {
            System.out.println("No");
        }
//        int n = sc.nextInt();
//
//        boolean flag = false;
//        int q = 0;
//        int p;
//        for(p=2; p<n && !flag; p++) {
//            if(isPrime(p)){
//                q = 0;
//                int t = n;
//                while(t % p == 0) {
//                    q++;
//                    t = t/p;
//                    if(t == 1) {
//                        flag = true;
//                        break;
//                    }
//                }
//            }
//        }
//        p--;
//        if (flag){
//            System.out.println(p + " " + q);
//        }else {
//            System.out.println("No");
//        }

    }
    static boolean isPrime(int n){
        for(int i=2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
