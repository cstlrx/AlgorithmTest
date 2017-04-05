package Company.FirstNews;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by lrx on 2017/3/30.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String[] nStr = new String[N];
            String[] mStr = new String[M];

            sc.nextLine();
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine();
                nStr[i] = str;
            }
            for (int i = 0; i < M; i++) {
                mStr[i] = sc.nextLine();
            }
            for (int i = 0; i < M; i++) {
                HashSet<String> hash = new HashSet<>();
                String[] arr = mStr[i].split(" ");
                for (int j = 0; j < arr.length; j++) {
                    hash.add(arr[j].toLowerCase());
                }
                int num = 0;
                int max = 0;
                int index = 0;
                for (int k = 0; k < N; k++) {
                    num = 0;
                    String[] nArr = nStr[k].split(" ");
                    for (int l = 0; l < nArr.length; l++) {
                        if (hash.contains(nArr[l].toLowerCase())) {
                            num++;
                        }
                    }
                    if (num > max) {
                        max = num;
                        index = k;
                    }
                }
                System.out.println(nStr[index]);
            }
        }
    }
}
//            String str = sc.next();
//            char[] arr = str.toCharArray();
//            while(true) {
//                int pos = 0;
//                int num = 0;
//                while (arr[pos] != ']') {
//                    num++;
//                    pos++;
//                }
//
//            }
