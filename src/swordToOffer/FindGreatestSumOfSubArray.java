package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-22下午1:35:36
 */
// 连续子数组最大和
public class FindGreatestSumOfSubArray {
	// 暴力穷举
	public int find1(int array[]) {
		if (array.length == 0)
			return 0;
		if (array.length == 1)
			return array[0];

		int result = array[0];
		int cur = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				for (int k = i; k <= j; k++) {
					cur += array[k];
				}
				if (cur > result)
					result = cur;
				cur = 0;
			}
		}
		return result;
	}

	public int find2(int array[]) {
		if (array.length == 0)
			return 0;
		if (array.length == 1)
			return array[0];

		int result = array[0];
		int cur = array[0];

		for (int i = 1; i < array.length; i++) {
			if (cur < 0)
				cur = 0;// 小于0清0
			cur += array[i];
			if (cur > result)
				result = cur;
		}
		return result;
	}

	public static void main(String[] args) {

	}
}
