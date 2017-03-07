package io.lrx.swordToOffer;

/**
 * Created by lrx on 2017/3/5.
 */

import java.util.ArrayList;
import java.util.Queue;

/**
 *  二叉树层级打印 并换行
 */

public class TreePrinter {
//    public static int[][] printTree(TreeNode root) {
//        // write code here
//        int row = 0;    // 指向二维数组的当前行
//        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
//        ArrayList<TreeNode> queue = new ArrayList<>();
//        TreeNode last = root;
//
//        queue.add(root);
//        TreeNode nLast = root;
//        while(!queue.isEmpty()) {
//            TreeNode p = queue.remove(queue.size()-1);
//            result.get(row).add(p.val);
//
//            if(p.left != null) {
//                queue.add(p.left);
//                nLast = p.left;
//            }
//            if(p.right != null) {
//                queue.add(p.right);
//                nLast = p.right;
//            }
//            if(p.equals(last)){ //到达行末尾
//                row ++;// 下一行
//                last = nLast;
//            }
//        }
//        int[][] res = new int[result.size()][500];
//        return res;
//    }
public static int[][] printTree(TreeNode root) {
    // write code here
    int row = 0, col=0;    // 指向二维数组的当前行
    int[][] result = new int[500][500];
    ArrayList<TreeNode> queue = new ArrayList<>();
    TreeNode last = root;// 指向当前行的最后

    queue.add(root);
    TreeNode nLast = root; // 指向下一行的最后
    while(!queue.isEmpty()) {
        TreeNode p = queue.remove(0);
        result[row][col++] = p.val;

        if(p.left != null) {
            queue.add(p.left);
            nLast = p.left;
        }
        if(p.right != null) {
            queue.add(p.right);
            nLast = p.right;
        }
        if(p.equals(last)){ //到达行末尾
            row ++;// 下一行
            col = 0;
            last = nLast;
        }
    }

    return result;
}
    public static void main(String[] args){
        TreeNode t= new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        int [][] res = new int[500][500];
        res = printTree(t);
        System.out.println(res[0][0]);
        System.out.println(res[0][1]);
        System.out.println(res[1][0]);
        System.out.println(res[1][1]);
        System.out.println(res[2][0]);
    }
}
