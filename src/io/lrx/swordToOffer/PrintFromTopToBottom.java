package io.lrx.swordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lrx
 * @time 2017-2-22ÏÂÎç5:09:24
 */
class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}

public class PrintFromTopToBottom {

	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Queue<TreeNode> que = new LinkedList<TreeNode>();

		// result.add(root.val);
		que.add(root);
		while (!que.isEmpty()) {
			TreeNode t = que.remove();
			if (t.left != null)
				que.add(t.left);
			if (t.right != null)
				que.add(t.right);
			result.add(t.val);
		}
		return result;
	}

}
