package CodingInterview;

/**
 * Created by lrx on 2017/3/8.
 */
// ��ŵ��
public class TowerMoveDisk {
    // �ݹ��
    public static void moveDisks(int n, int origin, int buffer, int destination) {
        if (n <= 0) return;
        moveDisks(n-1, origin, destination, buffer);
        System.out.println(origin + "->" + destination);
        moveDisks(n-1, buffer, origin, destination);
    }

    public static void main(String[] args) {
        moveDisks(3,1,2,3);
    }
}
