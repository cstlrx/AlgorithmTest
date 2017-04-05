package Company.wangyi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lrx on 2017/3/25.
 */

/*
如果一个数字序列逆置之后跟原序列是一样的就称这样的数字序列为回文序列。例如：
{1, 2, 1}, {15, 78, 78, 15} , {112} 是回文序列,
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} 不是回文序列。
现在给出一个数字序列，允许使用一种转换操作：
选择任意两个相邻的数，然后从序列移除这两个数，并用这两个数字的和插入到这两个数之前的位置(只插入一个和)。
现在对于所给序列要求出最少需要多少次操作可以将其变成回文序列。

输入描述:
输入为两行，第一行为序列长度n ( 1 ≤ n ≤ 50)
第二行为序列中的n个整数item[i]  (1 ≤ iteam[i] ≤ 1000)，以空格分隔。


输出描述:
输出一个数，表示最少需要的转换次数

输入例子:
4
1 1 1 3
 */
public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
//            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                array.add(sc.nextInt());
            }
            int l = 0;
            int r = n-1;
            int result = 0;
            while (l < r) {
                int lNum = array.get(l);
                int rNum = array.get(r);
                if (lNum < rNum) {
                    array.set(l,lNum+array.get(l+1));
                    array.remove(l+1);
                    r--;
                    result++;
                } else if(lNum > rNum){
                    array.set(r,rNum+array.get(r-1));
                    array.remove(r-1);
                    result++;
                    r--;
                } else {
                    l++;
                    r--;
                }
            }
            System.out.println(result);
        }

    }
}
