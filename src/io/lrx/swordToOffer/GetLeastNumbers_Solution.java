package io.lrx.swordToOffer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author lrx
 * @time 2017-2-27����10:33:59
 */
// ����n���������ҳ�������С��K������
// ��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
public class GetLeastNumbers_Solution {

	public static ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		// ���⴦��
		if (input.length == 0 || input.length < k || k <= 0) {
			return result;
		}
		// ������С��k����
		TreeSet<Integer> res = new TreeSet<Integer>();

		for (int i = 0; i < input.length; i++) {
			if (res.size() < k) {
				res.add(input[i]);
			} else {
				// ����ǰ��������С�����������������
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
