package CodingInterview;

/**
 * Created by lrx on 2017/3/10.
 */
// ����һ���������飬����һ�Ų��Ҷ�������Ҫ��߶Ⱦ���С
public class MakeFingTree {
    public static TreeNode createTree(int[] array, int lo, int hi) {
        if(hi < lo) return null;
        if(hi == lo)return new TreeNode(array[lo]);

        int mid = lo + (hi-lo)/2;
        TreeNode root = new TreeNode(array[mid]);
        root.left = createTree(array,lo,mid-1);
        root.right = createTree(array,mid+1,hi);

        return root;
    }

    public static void main (String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};

        TreeNode root = createTree(array,0,array.length-1);
        while(root!=null) {
            System.out.println(root.val);
            root = root.right;
        }
    }
}
