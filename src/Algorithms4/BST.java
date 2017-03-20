package Algorithms4;

/**
 * Created by lrx on 2017/3/12.
 */
// 二叉查找树API实现
public class BST<Key extends Comparable<Key> ,Value> {
    private Node root;
    private class Node {
        private Key key;
        private Value value;
        private Node left,right;
        private int N;// 当前子树的节点个数

        public Node(Key key,Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }
    public int size() {
        return size(root);
    }
    // 当前节点的个数在put时更新
    private int size(Node x) {
        if(x == null) return 0;
        return x.N;
    }
    public Value get(Key k) {
        return get(root, k);
    }
    private Value get(Node root, Key k) {
        if (root == null) return null;
        int m = root.key.compareTo(k);
        if(m < 0)
            return get(root.right, k);
        else if(m > 0) {
            return get(root.left, k);
        }else
            return root.value;
    }
    public void put(Key k, Value v) {
        root = put(root, k, v);
    }
    private Node put(Node root, Key k, Value v) {
        if(root == null) return new Node(k,v,1);
        int cmp = root.key.compareTo(k);
        if (cmp < 0) root.right = put(root.right,k,v);
        if (cmp > 0) root.left = put(root.left,k,v);
        else
            root.value = v;
        // 更新当前节点值
       root.N =  size(root.left) + size(root.right) + 1;
        return root;
    }
}