package swordToOffer;

/**
 * Created by lrx on 2017/3/20.
 */

public class FindFirstCommonNode {
    public static void main(String [] args) {

    }
    public static ListNode findFirstCommonNode (ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)return null;
        ListNode p1 = pHead1;
        int len1 = 0;
        while (p1 != null) {
            len1 += 1;
            p1 = p1.next;
        }
        ListNode p2 = pHead2;
        int len2 = 0;
        while (p2 != null) {
            len2 += 1;
            p2 = p2.next;
        }
        p1 = pHead1;
        p2 = pHead2;
        if (len1 > len2) {
            for(int i=0; i<(len1-len2); i++) {
                p1 = p1.next;
            }
        }else if (len1 < len2){
            for(int i=0; i<(len2-len1); i++) {
                p2 = p2.next;
            }
        }
        while (p1 != null && p1.val != p2.val) {
            p1 = p1.next;
            p2 = p2.next;
        }
        if(p1 == null)
            return null;
        else
            return p1;
    }
}
