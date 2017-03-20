package CodingInterview;

import java.util.Stack;

/**
 * Created by lrx on 2017/3/8.
 */


// �ж������Ƿ��ǻ��ĵ�
public class JudgeLinkedListPalindrome {
    static boolean isPalindrom(Node head) {
        if(head.next == null)return true;
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
        boolean flag = true;
        slow = slow.next;
        while(slow != null) {
            if(slow.val != st.pop()){
                flag = false;
                break;
            }
            slow = slow.next;
        }
//        while(slow != null) {
//            System.out.print(slow.val + " ");
//            slow = slow.next;
//        }

        return flag;
    }
    public static void main(String[] args) {
        Node p = new Node(1);
        Node head = p;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(3);
        p = p.next;
        p.next = new Node(1);
        p = p.next;
        // ������ʽ����
              //  .next = new Node(1).next = new Node(3).next = new Node(1);

        p = head;
//        while(p != null) {
//            System.out.print(p.val + " ");
//            p = p.next;
//        }
        System.out.print(isPalindrom(p));
    }

}
