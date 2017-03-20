package CodingInterview;

/**
 * Created by lrx on 2017/3/9.
 */
class TreeNode {
     int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
// 是否平衡
public class JudgeTreeSunHeight {
    private static int checkHeight(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1)
            return -1;

        if(Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        else {
            return Math.max(leftHeight,rightHeight) + 1;
        }
    }
    public static boolean isBalance(TreeNode root) {
        System.out.println(checkHeight(root));

        return false;
//        if(checkHeight(root) == -1) {
//            return false;
//        }else {
//            return true;
//        }
    }
    public static void main (String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = null;
        root.right = new TreeNode(2);
        TreeNode p = root.right;
        p.left = null;
        p.right = new TreeNode(3);
        p = p.right;
        p.left = null;
        p.right = new TreeNode(4);

        isBalance(root);
    }

}
