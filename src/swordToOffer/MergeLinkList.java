package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-15ÏÂÎç3:09:57
 */
public class MergeLinkList {
	// c++´úÂë
	/*
	 * struct ListNode { int val; struct ListNode *next; ListNode(int x) :
	 * val(x), next(NULL) { } };
	 */
	// class Solution {
	// public:
	// ListNode* Merge(ListNode* pHead1, ListNode* pHead2)
	// {
	// if(pHead1 == NULL)
	// return pHead2;
	// if(pHead2 == NULL)
	// return pHead1;
	//
	// ListNode* head = NULL;
	// ListNode* tail = NULL;
	// while(pHead1 != NULL || pHead2 != NULL){
	// if(head == NULL){
	// if(pHead1->val < pHead2->val){
	// head = pHead1;
	// pHead1 = head -> next;
	// }
	// else{
	// head = pHead2;
	// pHead2 = head -> next;
	// }
	// tail = head;
	// }else if(pHead1 == NULL){
	// tail -> next = pHead2;
	// break;
	// }else if(pHead2 == NULL){
	// tail -> next = pHead1;
	// break;
	// }
	// else if(pHead1 -> val < pHead2 -> val){
	// tail -> next = pHead1;
	// tail = tail -> next;
	// pHead1 = pHead1 -> next;
	// }else{
	// tail -> next = pHead2;
	// pHead2 = pHead2 -> next;
	// tail = tail -> next;
	// }
	// }
	// return head;
	// }
	// };
}
