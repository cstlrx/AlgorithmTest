package sort;

/**
 * Created by lrx on 2017/3/7.
 */
class Test{
    public static void main(String[] args) {
        MaxPQ<Integer> pq = new MaxPQ<Integer>(10);
        pq.insert(1);
        pq.insert(12);
        pq.insert(3);
        pq.insert(4);
        pq.insert(-4);
        System.out.println(pq.deleteMax());
    }
}
// 基于二叉堆的优先队列 （数组存储）
public class MaxPQ<key extends Comparable<key>> {
    private key[] array;
    private int N; // 优先队列当前的大小

    public MaxPQ(int max) {
        array = (key[]) new Comparable[max+1];// 泛型
    }
    public int size() {
        return N;
    }
    public boolean less(int i, int j){
        return array[i].compareTo(array[j]) < 0;
    }
    public void exec(int i, int j) {
        key t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    // 上浮
    private void swim(int k){
        while (k > 1){
            if(less(k/2,k)) {
                exec(k, k/2);
            }
            k = k/2;
        }
    }
    // 下沉
    private void sink(int k){
        while(2*k <= N) {
            int j = 2 * k;
            if((j+1)<=N && less(j,j+1))
                j++;
            if(!less(k,j))
                break;
            exec(k,j);
            k = j;
        }
    }
    public void insert(key k) {
        array[++N] = k;
        swim(N);
    }
    public key deleteMax() {
        key max = array[1];
        exec(1,N--);
        array[N+1] = null;
        sink(1);
        return max;
    }
}
