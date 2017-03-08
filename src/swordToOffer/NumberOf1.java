package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-12上午11:55:20
 */
public class NumberOf1 {
	// 由于负数使用补码表示，故不能通过所有用例
	public int NumberOf1(int n) {
		int count = 0;
		if (n < 0)
			count++;
		while (n != 0) {
			if (n % 2 == 1)
				count++;
			n = n / 2;
		}

		return count;
	}

	// 采用位运算
	public int NumberOf1_2(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) != 0)
				count++;
			flag <<= 1;
		}

		return count;
	}
}
