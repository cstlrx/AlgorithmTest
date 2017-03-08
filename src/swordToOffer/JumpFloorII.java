package swordToOffer;

/**
 * @author lrx
 * @time 2016-11-19上午11:08:00
 */
/*
 * 变态跳台阶
 */
// 思路：类似跳台阶：当前为n的台阶，可以从n-1,n-2,n-3,...处跳过来，而且可以直接跳过来。故：f(n)=1+f(n-1)+f(n-2)+...
// 很明显前边的思路像斐波那契数列一样，重复计算了某些已经计算过的值，故可以使用数组进行改进，每个数组元素存放为元素下标的解法数量
// 另一种解法：共2^(n-1)种情况，排列组合。。。
public class JumpFloorII {
	static int getResult(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else {
			int result = 1;// 因为可以直接跳到当前台阶
			for (int i = 1; i < n; i++) {
				result += getResult(i);
			}
			return result;
		}
	}

	public static void main(String[] args) {
		System.out.println(getResult(6));
	}
}
