package CodingInterview;

import java.util.HashMap;
import java.util.HashSet;


/**
 * Created by lrx on 2017/3/7.
 */
class Node {
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }
}
// 移除链表中的重复节点
public class RemoveRepeatNode {

    public static void remove(Node head) {
        HashSet<Integer> map = new HashSet();
        Node pre = null;
        while(head != null) {
            if(map.contains(head.val)){
                pre.next = head.next;
                //head = null;
                head = pre.next;
            }else {
                map.add(head.val);
            }
            pre = head;

        }
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3).next = new Node(5).next = new Node(4);

        remove(head);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
