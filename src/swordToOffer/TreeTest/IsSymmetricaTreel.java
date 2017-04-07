package swordToOffer.TreeTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lrx on 2017/4/6.
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}
public class IsSymmetricaTreel {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(9);
        TreeNode p = root.left;
        p.left = new TreeNode(5);
        p.right = new TreeNode(7);
        p = root.right;
        p.left = new TreeNode(7);
        p.right = new TreeNode(5);

        isSymmetrical1(root);
        System.out.println(p.val);
    }
    boolean  isSymmetrical2(TreeNode pRoot)
    {
        if (pRoot == null) return false;
        return isSymmetrical(pRoot,pRoot);
    }
    private boolean isSymmetrical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return isSymmetrical(root1.left,root2.right) && isSymmetrical(root1.right,root2.left);
    }

    // 定义中序遍历：左中右 右中左
    static boolean  isSymmetrical1(TreeNode pRoot)
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inOrder1(pRoot,list1);
        inOrder2(pRoot,list2);
        for (int i=0; i< list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }
    private static void inOrder1(TreeNode root, List<Integer> list1) {
        if (root == null) {
            list1.add(-1);
            return;
        }
        inOrder1(root.left,list1);
        list1.add(root.val);
        inOrder1(root.right,list1);
    }
    private static void inOrder2(TreeNode root, List<Integer> list2) {
        if (root == null) {
            list2.add(-1);
            return;
        }
        inOrder2(root.right,list2);
        list2.add(root.val);
        inOrder2(root.left,list2);
    }

}
