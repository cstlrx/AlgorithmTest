package swordToOffer.TreeTest;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/7.
 */
// 求二叉搜索树的第k大个节点，思路：中序遍历
public class TreeKthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        Stack<TreeNode> stack = new Stack<>();
        int num = 0;
        TreeNode t = pRoot;
        while (!stack.isEmpty() || t != null) {
            while (t != null) {
                stack.push(t);
                t = t.left;
            }
            t = stack.pop();
            num++;
            if (num == k) return t;
            t = t.right;
        }
        return null;
    }
}
