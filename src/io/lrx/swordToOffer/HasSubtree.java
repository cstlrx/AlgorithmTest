package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2017-2-15ÏÂÎç3:08:58
 */
public class HasSubtree {
	// c++´úÂë
	// bool flag = false;
	// bool flag2 = false;
	// bool HasSubtree(TreeNode* pRoot1, TreeNode* pRoot2)
	// {
	// if(pRoot1 == NULL || pRoot2 == NULL)return false;
	// preOrder(pRoot1, pRoot2);
	// //if(flag == false)return false;
	//
	// return flag2;
	// }
	// void preOrder(TreeNode* pRoot1, TreeNode* pRoot2){
	// if(pRoot1 == NULL)return;
	// if(pRoot1 -> val == pRoot2 -> val){
	// flag = isSubtree(pRoot1, pRoot2);
	// if(flag){
	// flag2 = true;
	// return;
	// }
	// }
	// preOrder(pRoot1 -> left, pRoot2);
	// preOrder(pRoot1 -> right, pRoot2);
	// }
	//
	// bool isSubtree(TreeNode* pRoot1, TreeNode* pRoot2)
	// {
	// if(pRoot2 == NULL) return true;
	// if(pRoot1 == NULL) return false;
	// if((pRoot1 -> val == pRoot2 -> val) && isSubtree(pRoot1 -> left,pRoot2 ->
	// left) &&
	// isSubtree(pRoot1 -> right,pRoot2 -> right))
	// return true;
	//
	// return false;
	// }
}
