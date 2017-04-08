package swordToOffer;

/**
 * Created by lrx on 2017/4/8.
 */
public class NumberOf1Between1AndN_Solution {
    private static int numOf1 (int n) {
        int num = 0;
        while (n != 0) {
            if (n % 10 == 1)
                num++;
            n /= 10;
        }
        return num;
    }

    public int numberOf1Between1AndN_Solution(int n) {
        if (n <= 0) return 0;
        int res = 0;
        for (int i=1; i<=n; i++) {
            res += numOf1(i);
        }
        return res;
    }
}
