package Company.qihu;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/18.
 */

/**
 * 小B的目的很简单:控制服务器的内存区域，试图在内存中装入从1到n之间的n个自然数，以覆盖内存区域。可能是小B对编程理解上的问题，病毒似乎没有完全成功。可能是由于保护机制的原因，内存写入只接受二进制的形式，所以十进制表达中除0和1之外的其他值都没有成功写入内存。小B希望知道，究竟有多少数成功的写入了服务器的内存！

 */
// 暴力超时
//    规律,其实也不能说是规律，弄得麻烦的
public class Find01 {


        public static void main (String [] args) {
            Scanner sc = new Scanner(System.in);
            int count;
            int[] array = new int[] {0,1,2,4,8,16,32,64,128,256};// 不同位数所对应的个数
            while (sc.hasNext()) {
                int num = sc.nextInt();
                count = 0;
                int n = count_bit(num);// 算出该数字的位数
                if (num > max(n)){
                    for (int i=0; i<=n; i++){ // 01的个数为加上小于当前位数的个数
                        count += array[i];
                    }
                    System.out.println(count);
                    continue;
                }
                for (int i=0; i<n; i++){ // 01的个数为加上小于当前位数的个数
                    count += array[i];
                }
                int st_n = 1;
                for (int i=1; i<n; i++) {
                    st_n *= 10;
                }
                for (int i=st_n; i<=num; i++){
                    if (i > max(n))
                        break;
                    if (is(i)){
                        count ++;
                    }
                }
                System.out.println(count);
            }
        }
        // 求出全一的数字
        private static int max (int st) {
            int r = 1;
            for (int i=1; i<st; i++) {
                r *= 10;
                r += 1;
            }
            return r;
        }
        private static int count_bit(int num) {
            int count = 0;
            while (num != 0){
                count ++;
                num /= 10;
            }
            return count;
        }
        private static boolean is(int num) {
            boolean  flag = true;
            while (num != 0) {
                if( ( (num %10) !=0) && ( (num %10) !=1) ) {
                    flag = false;
                    break;
                }
                num /= 10;
            }
            return flag;
        }
}
