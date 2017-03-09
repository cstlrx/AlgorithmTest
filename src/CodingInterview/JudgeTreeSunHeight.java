package CodingInterview;

/**
 * Created by lrx on 2017/3/9.
 */
class TreeNode {
    private int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
// 判断一棵树是否是平衡树：两颗子树高度相差不超过1
public class JudgeTreeSunHeight {
    private static int checkHeight(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = checkHeight(root.right);
        if(leftHeight == -1)
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

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode p = root.left;
        p.left = new TreeNode(4);
        p.right = new TreeNode(5);
        p = p.left;
        p.left = new TreeNode(6);
        p.right = new TreeNode(7);

        isBalance(root);
    }

}
