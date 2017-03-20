package swordToOffer;

/**
 * Created by lrx on 2017/3/20.
 */

public class TreeDepth {
    public static int treeDepth(TreeNode root) {

        return getDepth(root);
    }
    private static int getDepth(TreeNode root) {
        if(root == null) return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.max(left,right) + 1;
    }
}
