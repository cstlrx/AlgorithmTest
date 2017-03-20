package swordToOffer;

/**
 * Created by lrx on 2017/3/19.
 */
// 逆序对
public class InversePairs {
    public int inversePairs1(int[] array) {
        int mod = 1000000007;
        long count = 0;

        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array.length; j++) {
                if (array[i] < array[j])count++;
            }
        }
        return (int)(count % 1000000007);
    }

    static long count;
    static int[] m = null;
    public static int inversePairs(int[] array) {
        int mod = 1000000007;
        count = 0;
        m = new int[array.length];
        sort (array,0,array.length-1);

        System.out.println(count);
        return (int)(count % mod);
    }

    private static void sort(int[] array, int start, int end) {
        if (end <= start) return;
        int mid = (start + end) / 2;
        sort (array, start, mid);
        sort (array, mid + 1, end);
        merge (array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int l=start, r = mid + 1;
        int index = start;
        for (int i=start; i<=end; i++) {
            m[i] = array[i];
        }
//        int l = start, r = mid+1, index = start;
//        for (int i=start; i<=end; i++) m[i] = array[i];

        while (l <= mid || r <= end) {
            if (l > mid) {
                array[index++] = m[r++];
            }else if(r > end) {
                array[index++] = m[l++];
            } else if (m[l] < m[r]) {  // 比较的是m数组,若左边比右边大则为逆序数组
                array[index++] = m[l++];
            }else {
                array[index++] = m[r++];
                count += mid-l+1;
            }
        }
//        int l = start, r = mid+1, index = start;
//        for (int i=start; i<=end; i++) m[i] = array[i];
//        while (l <= mid || r <= end) {
//            if (l > mid) array[index++] = m[r++];
//            else if (r > end) array[index++] = m[l++];
//            else if (m[l] < array[r]) array[index++] = m[l++];
//            else {
//                array[index++] = m[r++];
//            }
//        }

    }
    public static void main (String [] args) {
        inversePairs(new int[] {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575});
    }
}
