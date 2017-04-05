package Company.Tencent;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by lrx on 2017/3/25.
 */
// 判断一个数是否由两个质数相加
public class JudgePrime {

        public static boolean isPrime(int num) {
            if(num < 2) return false;
            if(num == 2) return true;
            for(int i=2; i<Math.sqrt(num)+1; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        static ArrayList<Integer> priArr = new ArrayList<Integer>();
        // 该方法作用建立一个素数表
        public static void setPrime(int num) {
            boolean[] flag = new boolean[num+1];
            for (int i=2; i<=num; i++) {
                for (int j=i+i; j<=num; j+=i) {
                    flag[j] = true;// 非质数
                }
            }
            for(int i=2; i<=num; i++) {
                if(!flag[i])
                    //priArr.add(i);
                    System.out.println(i);
            }
        }
        public static int getPrime2(int num) {
            int res = 0;
            for(int i=2; i<=num/2; i++) {
                if(priArr.contains(num-i)) {
                    if(priArr.contains(num-i)) {
                        res++;
                    }
                }
            }
            return res;
        }
        // 暴力求素数
        public static int getPrime(int num) {
            int res = 0;
            for(int i=2; i<=num/2; i++) {
                if(isPrime(i)) {
                    if(isPrime(num-i)) {
                        res++;
                    }
                }
            }
            return res;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            setPrime(num);
            //System.out.println(getPrime(num));
        }
}
