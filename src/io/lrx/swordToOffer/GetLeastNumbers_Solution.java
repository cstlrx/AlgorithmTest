package io.lrx.swordToOffer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author lrx
 * @time 2017-2-27下午10:33:59
 */
// 输入n个整数，找出其中最小的K个数。
// 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class GetLeastNumbers_Solution {

	public static ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// 特殊处理
		if (input.length == 0 || input.length < k || k <= 0) {
			return result;
		}
		// 保存最小的k个数
		TreeSet<Integer> res = new TreeSet<Integer>();

		for (int i = 0; i < input.length; i++) {
			if (res.size() < k) {
				res.add(input[i]);
			} else {
				// 若当前遍历的数小于最大的数，则替代它
				int max = res.last();
				if (input[i] < max) {
					res.remove(max);
					res.add(input[i]);
				}
			}
		}

		result.addAll(res);
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = getLeastNumbers_Solution(new int[] { 1,
				2, 3, 4, 4 }, 3);
		System.out.println(arrayList);
	}
}
