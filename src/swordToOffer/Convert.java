package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-25ÉÏÎç10:55:51
 */

public class Convert {
	static TreeNode tail = null;

	public static TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null)
			return null;

		convert(pRootOfTree);

		TreeNode result = null;
		TreeNode p = tail;
		while (p != null && p.left != null) {
			p = p.left;
		}
		result = p;
		return result;
	}

	public static void convert(TreeNode root) {
		if (root == null)
			return;

		TreeNode cur = root;
		if (cur.left != null)
			convert(cur.left);
		cur.left = tail;
		if (tail != null)
			tail.right = cur;
		tail = cur;
		if (cur.right != null) {
			convert(cur.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(14);
		Convert(root);
	}
}
