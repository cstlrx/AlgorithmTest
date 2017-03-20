package Company;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/19.
 */

public class MatrixTest {

    /*
    1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
     */
    private static boolean isVal(int x, int y,int R) {
        if(x<0 || y < 0)return false;
        if(x>=R || y>=R)return false;
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int[][] array = new int[R][C];
            int x=0,y=0;
            int max = 0;
            for (int i=0; i<R; i++){
                for (int j=0; j<C; j++){
                    int n = sc.nextInt();
                    array[i][j] = n;
                }
            }
            //System.out.println(max);
            int lastRes = 0;
            for (int i=0; i<R; i++) {
                for (int j = 0; j < C; j++) {
                    max = array[i][j];
                    x = i;
                    y = j;
                    int res = 1;
                    boolean flag = false;
                    while (true) {
                        int cha = Integer.MAX_VALUE;
                        int nX = 0, nY = 0;
                        flag = false;
                        if (isVal(x - 1, y, R) && array[x - 1][y] < max) {
                            if (max - array[x - 1][y] < cha) {
                                cha = max - array[x - 1][y];
                                nX = x - 1;
                                nY = y;
                            }
                            flag = true;
                        }
                        if (isVal(x, y - 1, R) && array[x][y - 1] < max) {
                            if (max - array[x][y - 1] < cha) {
                                cha = max - array[x][y - 1];
                                nX = x;
                                nY = y - 1;
                            }
                            flag = true;
                        }
                        if (isVal(x + 1, y, R) && array[x + 1][y] < max) {
                            if (max - array[x + 1][y] < cha) {
                                cha = max - array[x + 1][y];
                                nX = x + 1;
                                nY = y;
                            }
                            flag = true;
                        }
                        if (isVal(x, y + 1, R) && array[x][y + 1] < max) {
                            if (max - array[x][y + 1] < cha) {
                                cha = max - array[x][y + 1];
                                nX = x;
                                nY = y + 1;
                            }
                            flag = true;
                        }
                        max = array[nX][nY];
                        if (!flag)
                            break;
                        res += 1;
                        x = nX;
                        y = nY;

                    }
                    if (res > lastRes) lastRes = res;
                    //System.out.println(res);
                }
            }
            System.out.println(lastRes);
        }
    }
}
