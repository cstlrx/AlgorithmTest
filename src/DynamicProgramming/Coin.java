package DynamicProgramming;

/**
 * Created by lrx on 2017/3/22.
 */
// 兑换硬币问题
//    假设有面值1 3 5的硬币，求将20元兑换的最小硬币数量。
//    dp[i]存放i元需要的最小硬币数。dp[0]=0,当兑换1元时，最小的数量是1，即dp[1]=1，
//    当兑换2元时，结果：max(dp[2-1]+1)，3元时，结果为max(dp[3-1]+1,dp[3-3]+1);
//    故当存放的金额为N时，dp[n] = max(dp[n-1]+1,dp[n-3]+1,dp[n-5]+1);
public class Coin {

    public static void find(int value, int[] coins, int[] dp) {
        dp[0] = 0;
        for (int i=1; i<dp.length; i++) {
            int min = 9999;
            for (int j=0; j<coins.length; j++) {
                if (i >= coins[j]) {
                    min = Math.min(min, dp[i-coins[j]]+1);
                }
            }
            dp[i] = min;
            System.out.println(dp[i]);
        }
        //System.out.println(dp[dp.length-1]);
    }
    public static void main (String[] args) {
        int[] coins = {1,3,5};// 存放硬币
        int[] dp = new int[21];

        find(20,coins,dp);
    }
}
