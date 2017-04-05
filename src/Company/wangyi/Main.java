package Company.wangyi;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/25.
 */
/*
2
-2 -2
0 -2
-4 -2
15 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            char[] arr2 = str.toCharArray();
            int res = 0;
            for (int i=0; i<arr.length-1; i++) {
                for (int j=i; j<arr.length-1; j++) {
                    if(arr[j] != 'G')continue;
                    else {
                        if(arr[j+1] != 'G'){
                            char t = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = t;
                            res++;
                        }
                    }
                }
            }
            int nRes = 0;
            for (int i=0; i<arr2.length-1; i++) {
                for (int j=i; j<arr2.length-1; j++) {
                    if(arr2[j] != 'B')continue;
                    else {
                        if(arr2[j+1] != 'B'){
                            char t = arr2[j];
                            arr2[j] = arr2[j+1];
                            arr2[j+1] = t;
                            nRes++;
                        }
                    }
                }
            }
            res = Math.min(res,nRes);
            System.out.println(res);
//            for(int i=0; i<arr.length; i++) {
//                System.out.println(arr[i]);
//            }
        }
    }
}

//        while(sc.hasNext()) {
//            int n = sc.nextInt();
//            int[] arrX = new int[n];
//            int[] arrY = new int[n];
//            for (int i=0; i<n; i++) {
//                arrX[i] = sc.nextInt();
//            }
//            for (int i=0; i<n; i++) {
//                arrY[i] = sc.nextInt();
//            }
//            int gx = sc.nextInt();
//            int gy = sc.nextInt();
//            int walk = sc.nextInt();
//            int car = sc.nextInt();
//
//            int walkTime = (Math.abs(gx) + Math.abs(gy)) * walk;
//            int result = walkTime;
//
//            for (int i=0; i<n; i++) {
//                int time = (Math.abs(arrX[i])+Math.abs(arrY[i])) * walk;
//                time += (Math.abs(gx - arrX[i])+Math.abs(gy - arrY[i])) * car;
//                if(time < result) result = time;
//            }
//            System.out.println(result);
//        }
//        while(sc.hasNext()) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//
//            long[] arr = new long[n];
//            for(int i=0; i<n; i++) {
//                arr[i] = (long)sc.nextInt();
//            }
//            for(int i=0; i<k; i++) {
//                long a0 = arr[0];
//                for (int j=0; j<n; j++) {
//                    if(j==n-1)
//                        arr[j] += a0;
//                    else
//                        arr[j] += arr[j+1];
//                    arr[j] %= 100;
//                }
//            }
//            for(int i=0; i<n; i++) {
//                if(i != n-1)
//                    System.out.print(arr[i] + " ");
//                else
//                    System.out.println(arr[i]);
//            }
//        }
