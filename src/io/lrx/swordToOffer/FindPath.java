package io.lrx.swordToOffer;

import java.util.ArrayList;

/**
 * @author lrx
 * @time 2017-2-23����11:11:17
 */
class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}

public class FindPath {
	public static ArrayList<Integer> change(ArrayList<TreeNode> al) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		for (TreeNode t : al) {
			res.add(t.val);
		}
		return res;
	}

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<TreeNode> onePath = new ArrayList<TreeNode>();
		if (root == null)
			return result;

		int wayValue = 0;
		TreeNode p = root;
		// �������ǵݹ����
		while (!onePath.isEmpty() || p != null) {
			while (p != null) {
				wayValue += p.val;
				onePath.add(p);
				p = p.left;
			}
			if (!onePath.isEmpty()) {
				p = onePath.remove(onePath.size() - 1).right;

				if (p == null) {
					if (wayValue == target)
						result.add(change(onePath));
				} else {
					wayValue += p.val;
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {

	}
}
