package DynamicProgramming;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/29.
 */
/*
    小鱼儿和安吉一起去参加爸爸去哪儿，村长交给他们一项任务，是用老乡的水果去给爸爸兑换一个礼物，要求水果和礼物等价，不能多也不能少。假设老乡有n种水果，每种水果的数量不限，每种水果的价值不同。请帮小鱼儿和安吉计算出他们最少要和老乡要几个水果。如果无法兑换返回-1.
举例：
1.有3种水果，价值分别是5，2，3。礼物的价值是20.用4个5元的水果正好兑换，其他的兑换方法都要更多的水果，所以返回4
2.有两种水果，价值分别是5,3，礼物的价值是2.无法正好兑换，所以返回-1

输入
输入数据是一个数组和一个整数代表礼物价值

输出
对于每个测试实例，要求输出最少水果数


样例输入
5,2,3
20

样例输出
4

 */
public class Main {
    public static void find(int value, int[] f, int[] dp) {
        dp[0] = 0;
        for (int i=1; i<dp.length; i++) {
            int min = 9999;
            for (int j=0; j<f.length; j++) {
                if (i >= f[j]) {
                    min = Math.min(min, dp[i-f[j]]+1);

                }
            }
            dp[i] = min;
           // System.out.println("i = " + i +" "+ dp[i]);
        }
        //System.out.println(dp[dp.length-1]);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dp;
         while(sc.hasNext()) {
             String str = sc.next();
             String[] arr = str.split(",");
             int[] intArr = new int[arr.length];
             for(int i=0; i<arr.length; i++) {
                 intArr[i] = Integer.parseInt(arr[i]);
             }
             int value = sc.nextInt();
             dp = new int[value+1];
             for(int i=0; i<dp.length; i++) {
                 dp[i] = -1;
             }
             find(value, intArr, dp);
             for(int i=0; i<dp.length; i++) {
                 if(dp[i] == 9999)
                    dp[i] = -1;
             }

           System.out.println(dp[value]);
         }
    }
}
