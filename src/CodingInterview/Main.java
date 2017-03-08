package CodingInterview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lrx on 2017/3/7.
 */

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        boolean flag = false;
        int l = 1,r = 1;
        for(int len=L; len<=100 && !flag; len++) {
//            长度为L的连续整数和N为：设开始整数x，(x+x+L-1)*L/2 = N
            int x = (2*N+len*(1-len)) % (2*len);
            if ( (x == 0 ) && (2*N+len*(1-len))>=0 ){
                flag = true;
                l = (2*N+len*(1-len)) / (2*len);

                r = l+len-1;
            }
            // 优化这一段
//            l = 1;
//            r = len;
//            while(l <= N/2){
//                int sum = (l+r)*len/2;
//                if(sum == N) {
//                    flag = true;
//                    break;
//                }
//                if(sum > N) {
//                    break;
//                }
//                l++;
//                r++;
//            }
        }
        if(flag) {
            for (int i = l; i <= r; i++) {
                if (i != r)
                    System.out.print(i + " ");
                else
                    System.out.print(i);
            }
        }else {
            System.out.println("No");
        }
//        int sum = 0;
//        int count = 0;
//        int lastCount = 0;
//        for(int i=1; i<=N; i++) {
//            for(int j=i; j<=N;j++){
//                sum += j;
//                count++;
//                if(sum > N){
//                    if(count < lastCount){
//                        lastCount = count;
//
//                    }
//                    count = 0;
//                    break;
//                }
//            }
//        }
    }
}
