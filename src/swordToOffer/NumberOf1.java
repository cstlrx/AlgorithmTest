package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-12����11:55:20
 */
public class NumberOf1 {
	// ���ڸ���ʹ�ò����ʾ���ʲ���ͨ����������
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

	// ����λ����
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
