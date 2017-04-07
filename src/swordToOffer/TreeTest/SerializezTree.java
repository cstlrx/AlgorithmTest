package swordToOffer.TreeTest;

/**
 * Created by lrx on 2017/4/7.
 */
public class SerializezTree {
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = null;
        TreeNode p = root.left;
        p.left = new TreeNode(3);
        p.right = null;
        p = p.left;
        p.left = new TreeNode(2);
        p.right = null;

        String s = serialize(root);
        System.out.println(s);
        root = deserialize(s);
        System.out.println(root.val + " " + root.left.val+ " ");
    }
    static String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        preOrder(root,res);
        return res.toString();
    }
    static void preOrder (TreeNode root, StringBuilder sb) {
        if (root == null){
            sb.append("#");
            return ;
        }
        sb.append(Integer.toString(root.val) + "*");
        preOrder(root.left,sb);
        preOrder(root.right,sb);
    }

    static int index = 0;
    static TreeNode deserialize(String str) {
        index = 0;
        //  TreeNode root = new TreeNode(str.charAt(0));
        return dePreOrder(str.toCharArray());
    }
    static TreeNode dePreOrder(char[] arr) {
        if (arr[index] == '#') {
            index++;
            return null;
        }
        StringBuilder s = new StringBuilder(arr[index++] + "");
        while (arr[index] != '*') {
            s.append(arr[index++] + "");
        }
        index++;
        TreeNode root = new TreeNode(Integer.parseInt(s.toString()));
        root.left = dePreOrder(arr);
        root.right = dePreOrder(arr);
        return root;
    }
}
