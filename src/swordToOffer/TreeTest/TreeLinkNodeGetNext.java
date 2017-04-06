package swordToOffer.TreeTest;

/**
 * Created by lrx on 2017/4/6.
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class TreeLinkNodeGetNext {
    private static TreeLinkNode getNextChild(TreeLinkNode pNode) {
        TreeLinkNode p = pNode.right;
        if (p == null) return p;
        while (p.left != null) {
            p = p.left;
        }
        return p;
    }
    private static TreeLinkNode getNextParent(TreeLinkNode pNode) {
        TreeLinkNode p = pNode;
        // 若此节点为父节点的左孩子，则下一个节点为它父节点
        if (pNode.next.left != null && pNode.next.left.val == pNode.val) { // 注意判空
            return pNode.next;
        } else {
            while(p.next != null && (p.next.left == null || p.next.left.val != p.val)) {// 注意判空
                p = p.next;
            }
            if (p.next == null)
                return null;
            return p.next;
        }
    }

    public static TreeLinkNode getNext(TreeLinkNode pNode)
    {
        if (pNode.next == null || pNode.right != null) {
            // 若该节点为根节点或右孩子不为空，则下一个节点在他右子树中
            return getNextChild(pNode);
        } else {
            return getNextParent(pNode);
        }
    }

    public static void main(String[] args) {
        TreeLinkNode root = new TreeLinkNode(8);
        root.left = new TreeLinkNode(6);
        root.left.next = root;
        root.right = new TreeLinkNode(10);
        root.right.next = root;
        TreeLinkNode p = root.left;
        p.left = new TreeLinkNode(5);
        p.left.next = p;
        p.right = new TreeLinkNode(7);
        p.right.next = p;
        p = getNext(p.right);
        System.out.println(p.val);
    }
}
