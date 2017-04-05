/**
 * Created by lrx on 2017/3/21.
 */


public class StrToInt {
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) return 0;

        long res = 0;
        boolean flag = false;// 是否是负数的标志
        char[] arr =str.toCharArray();
        int index = 0;
        if (arr[0] == '-'){
            flag = true;
            index++;
        } else if(arr[0] == '+')
            index++;
        while (index < arr.length) {
            char c = arr[index];
            if (c >= '0' && c <= '9')
                res = res*10 + (c-'0');
            else{
                return 0;
            }
            long n = flag ? -res : res;
            if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE)
                return 0;
            index++;
        }

        return (int)(res = flag ? -res : res);
    }
    public static void main(String[] args) {
        int a = StrToInt("-123");

        System.out.print(a);
    }
}
