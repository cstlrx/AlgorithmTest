package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2016-11-6����12:18:31
 */
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ���������������Ľ���ж������ظ������֡���������ǰ���������{1,2,4,7,3,5
 * ,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class BinaryTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private TreeNode root;

	public TreeNode reConstructBinaryTree(int[] pre, int l1, int r1, int[] in,
			int l2, int r2) {

		TreeNode root = new TreeNode(pre[l1]);
		if (r1 == l1) {
			return root;
		}
		// �ҵ����������е�λ��
		int rootIndex;
		for (rootIndex = l2; rootIndex <= r2; rootIndex++) {
			if (in[rootIndex] == root.val)
				break;
		}
		if (rootIndex > l2) {
			root.left = reConstructBinaryTree(pre, l1 + 1, l1
					+ (rootIndex - l2), in, l2, rootIndex - 1);
		}
		if (rootIndex < r2) {
			root.right = reConstructBinaryTree(pre, l1 + (rootIndex - l2) + 1,
					r1, in, rootIndex + 1, r2);
		}
		return root;
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0,
				in.length - 1);
		return root;
	}

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] in = { 4, 7, 2, 1, 5, 3, 8, 6 };
		BinaryTree b = new BinaryTree();
		System.out.println(b.reConstructBinaryTree(pre, in).val);
	}

}
