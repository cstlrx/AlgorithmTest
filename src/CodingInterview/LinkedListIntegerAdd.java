package CodingInterview;

/**
 * Created by lrx on 2017/3/8.
 */

public class LinkedListIntegerAdd {
    public static Node add(Node p, Node q) {
        int c = 0; //½øÎ»
        Node result = new Node(0);
        Node t = result;
        while (p != null || q != null) {
            if(p == null) {
                t.next = new Node((q.val + c)%10);
                c = (q.val + c)/10;
                t = t.next;
                q = q.next;
            }else if(q == null) {
                t.next = new Node((p.val + c)%10);
                c = (p.val + c)/10;
                t = t.next;
                p = p.next;
            }else {
                t.next = new Node((q.val + p.val + c)%10);
                c = (q.val + p.val + c)/10;
                t = t.next;
                p = p.next;
                q = q.next;
            }
        }
        return result.next;
    }
    public static void main (String[] args) {
        Node p = new Node(1);
        p.next = new Node(4);
        Node q = new Node(9);

        Node result = add(p,q);
        System.out.println(result.val);
        System.out.println(result.next.val);
    }
}
