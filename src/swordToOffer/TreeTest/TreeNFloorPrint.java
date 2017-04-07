package swordToOffer.TreeTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by lrx on 2017/4/7.
 */
// 二叉树层级打印，并换行
//    思路：维持两个指针，一个指向当前行的最后一个节点，一个指向下一行结尾节点
public class TreeNFloorPrint {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        ArrayList<Integer> floor = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        TreeNode cur = pRoot;
        TreeNode next = pRoot;
        while (!queue.isEmpty()) {
            TreeNode t = queue.removeFirst();
            floor.add(t.val);
            if (cur.val == t.val) {
                res.add(floor);

                floor = new ArrayList<>();
            }
            if (t.left != null) {
                queue.add(t.left);
                next = t.left;
            }
            if (t.right != null) {
                queue.add(t.right);
                next = t.right;
            }
            if (cur.val == t.val)
                cur = next;
        }
        return res;
    }
}
