package Company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by lrx on 2017/3/19.
 */

class Node {
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}

public class JudgeLinked {
    static int judge(Node head) {
        if(head.next == null)return 1;
        Stack<Integer> st = new Stack<>();
        Node slow = head;
        Node fast = head.next.next;
        st.push(slow.val);
        while(fast != null) {
            slow = slow.next;
            st.push(slow.val);
            if(fast.next == null) {
                st.pop();
                break;
            }else {
                fast = fast.next.next;
            }
        }
        int flag = 1;
        slow = slow.next;
        while(!st.isEmpty() && slow != null) {
            if(slow.val != st.pop()){
                flag = 0;
                break;
            }
            slow = slow.next;
        }
        return flag;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            String[] arr = str.split(",");
            Node head = new Node(0);
            Node p = head;

            for (int i=0; i<arr.length; i++) {
                p.next = new Node(Integer.parseInt(arr[i]));
                p = p.next;
            }
//            while(head != null) {
//                System.out.print(head.val);
//                head = head.next;
//            }
            int res = judge(head.next);
            System.out.print(res);
        }
    }

}
