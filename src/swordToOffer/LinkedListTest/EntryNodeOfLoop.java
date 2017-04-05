package swordToOffer.LinkedListTest;

/**
 * Created by lrx on 2017/4/4.
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//　找到有环链表的入口节点
public class EntryNodeOfLoop {
    private static int getLength(ListNode head) {
        ListNode p1,p2;

        // 先各自走一下
        p1 = head.next;
        if (p1 != null)
            p2 = p1.next;
        else {
            return -1;
        }
        while(p2 != null && p1.val != p2.val) {
            p1 = p1.next;
            if (p2.next != null)
                p2 = p2.next.next;
            else
            p2 = null;
        }
        if (p2 == null) return -1;
        int length = 1;
        p2 = p2.next;
        while (p2.val != p1.val) {
            p2 = p2.next;
            length++;
        }
        return length;
    }



    public static ListNode entryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null) return null;
        int length = getLength(pHead);
        // 无环链表
        if (length == -1) return null;
        ListNode p1 = pHead,p2 = pHead;
        // p2先向后移动环的长度
        for (int i=0; i<length; i++) {
            p2 = p2.next;
        }
        while(p1.val != p2.val) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        entryNodeOfLoop(new ListNode(1));
    }
}
