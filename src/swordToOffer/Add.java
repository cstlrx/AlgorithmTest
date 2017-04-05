package swordToOffer;

/**
 * Created by lrx on 2017/3/21.
 */
// 不用+-*/ 求两个数的和
public class Add {
    private static int getBit(int num, int n) {
        return 1 << n & num;
    }
    // 不能处理负数
    public static int add(int num1,int num2) {
        int res = 0;

        int n = 0;
        int c = 0;// 进位
        while (num1 != 0 || num2 != 0 || c!=0) {
            int bit1 = getBit(num1,0);
            int bit2 = getBit(num2,0);
            res |= (bit1^bit2^c) << n;
            int cou = 0;
            if(bit1==1)cou++;
            if(bit2==1)cou++;
            if(c==1)cou++;
            if (cou >= 2) c = 1;
            else c=0;
            num1 /= 2;
            num2 /= 2;
            n++;
        }
        //if (c==1)res |= 1<<n;
        System.out.println(res);

        return res;
    }
    // 剑指offer的解法
    public static int add2(int num1,int num2) {
        int sum = 0;
        int carry = 0;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;

            num1 = sum;
            num2 = carry;
        } while(carry != 0);
        System.out.println(num1);
        return num1;
    }
    public static void main(String[] args) {
        add2(-2,-1);
    }
}
