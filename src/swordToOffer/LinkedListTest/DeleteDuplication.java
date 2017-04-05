package swordToOffer.LinkedListTest;

/**
 * Created by lrx on 2017/4/5.
 */
//删除重复节点
public class DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null) return null;
//        新建一个节点作为结果的头结点
        ListNode res = new ListNode(0);
        ListNode tail = res;// 尾指针
        ListNode p = pHead;
        ListNode q;
        boolean flag = false;// 标志位，是否重复
        while (p != null) {
            q = p.next;
            flag = false;
            while (q != null && q.val == p.val) {
                flag = true;
                q = q.next;
            }
            if (flag) {
                p = q;
            } else {
                tail.next = p;
                tail = tail.next;
                p.next = null; // 断开连接
                p = q;
            }
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        ListNode t = head.next;
        t.next = new ListNode(1);
        t = deleteDuplication(head);
        while (t != null) {
            System.out.println(t.val);
            t = t.next;
        }
    }
}
