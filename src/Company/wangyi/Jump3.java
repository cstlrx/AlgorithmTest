package Company.wangyi;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/25.
 */

public class Jump3 {
    static  int lastRes = Integer.MAX_VALUE;
    static int res = 0;
    private static void getRes(int cur, int M) {
        if(cur > M) {
            res--;
            return;
        }
        if(cur == M) {
            if (res < lastRes) {
                lastRes = res;
            }
            res--;
            return;
        }
        for (int i=2; i<cur; i++) {
            if(cur % i == 0) {
                res++;
                getRes(cur+i,M);
                cur -= i;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            getRes(N,M);
            System.out.println(lastRes);
        }
    }
}
