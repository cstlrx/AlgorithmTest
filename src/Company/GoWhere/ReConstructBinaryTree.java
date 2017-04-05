package Company.GoWhere;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by lrx on 2017/4/1.
 */
class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class ReConstructBinaryTree {
    private static TreeNode root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(sc.hasNext()) {
             int N = sc.nextInt();
             int[] pre = new int[N];
             int[] in = new int[N];
             for(int i=0; i<N; i++) {
                 pre[i] = sc.nextInt();
             }
             for(int i=0; i<N; i++) {
                 in[i] = sc.nextInt();
             }
             root = create(pre ,in);
             print(root);
         }
    }
    public static TreeNode create(int[] pre, int[] in) {
        root = create(pre, 0, pre.length - 1, in, 0,
                in.length - 1);
        return root;
    }
    public static TreeNode create(int[] pre, int l1, int r1, int[] in,
                                          int l2, int r2) {

        TreeNode root = new TreeNode(pre[l1]);
        if (r1 == l1) {
            return root;
        }
        int rootIndex;
        for (rootIndex = l2; rootIndex <= r2; rootIndex++) {
            if (in[rootIndex] == root.val)
                break;
        }
        if (rootIndex > l2) {
            root.left = create(pre, l1 + 1, l1
                    + (rootIndex - l2), in, l2, rootIndex - 1);
        }
        if (rootIndex < r2) {
            root.right = create(pre, l1 + (rootIndex - l2) + 1,
                    r1, in, rootIndex + 1, r2);
        }
        return root;
    }
    public static void print(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> que = new LinkedList<TreeNode>();

        que.add(root);
        while (!que.isEmpty()) {
            TreeNode t = que.remove();
            if (t.left != null)
                que.add(t.left);
            if (t.right != null)
                que.add(t.right);

            System.out.print(t.val + " ");
        }
        return;
    }
}
