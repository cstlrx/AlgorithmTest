package Company.wangyi;

import java.util.Scanner;

/**
 * Created by lrx on 2017/3/25.
 */

public class Circle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int rr = sc.nextInt();

            int nagX = -(int) Math.sqrt(rr);
            int posX = (int) Math.sqrt(rr);
            int result = 0;
            for (int i = nagX; i <= posX; i++) {
                int yy = rr - i * i;
                if(yy == 0) {
                    result += 1;
                    continue;
                }
                int y = (int) Math.sqrt(yy);
                if(yy / y == y && yy % y == 0){// y的平方=yy
                    result += 2;
                }
            }

            System.out.println(result);
        }
    }

}
