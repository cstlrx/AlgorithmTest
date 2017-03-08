package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-15下午12:39:14
 */
/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 */
public class OddEvenArray {

	public static void reOrderArray(int[] array) {
		int length = array.length;
		if (length == 0 || length == 1)
			return;

		int start = 0;
		while (array[start] % 2 != 0) {
			start++;// start指向第一个偶数
			if (start == length)
				return;
		}
		int oddP = start + 1;
		while (oddP < length) {
			while (array[oddP] % 2 == 0) {
				oddP++;// 使oddP指向奇数
				if (oddP == length)
					break;
			}
			if (oddP < length) {
				int odd = array[oddP];
				for (int i = oddP - 1; i >= start; i--) {
					array[i + 1] = array[i];
				}
				array[start] = odd;
				while (array[start] % 2 != 0)
					start++;
				oddP = start + 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray(array);
	}

}
