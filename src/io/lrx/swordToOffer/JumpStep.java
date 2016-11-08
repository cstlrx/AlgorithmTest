package io.lrx.swordToOffer;

/**
 * @author lrx
 * @time 2016-11-8下午12:07:37
 */
//
// 一个青蛙跳n个台阶，每次只能跳一节或两节，有几种方法 ，
// 思路一：青蛙在第n阶上边时，有两种情况：1、从上一阶跳了一级2、从上两级跳了两级
// 那它在第n-1级也是两种情况，在n-2也是。我们用一个函数fun来表示青蛙在第n阶的情况，
// 每次当递归到n为0时表示这是一种解法。未通过。！！！第一种思路情况太多，100时直接陷入死局，这是一种求步数的方法，太复杂。
// 思路2：其他人的解法： 青蛙在刚开始时，解法有f(n)种，可能跳了一级，也可能跳了两级。在跳一级时剩下的解法有f(n-1)种，跳两级时解法有f(n-2)种
// f(n) = f(n-1)+f(n-2);就是一个斐波那契数列。
// 这种方法直接求的是解法。这是一种解法之间的递归关系，比上一种少了许多情况，递归更加高效因为知道解法的数量就好，不需要知道具体解法的内容。
// 也可以这样理解：在第n级上，有可能是从n-1处跳了一步，有可能是从n-2处跳了两步过来，所以f(n) = f(n-1)+f(n-2);
public class JumpStep {
	// 方法一
	// static int count = 0;

	// static void fun(int n) {
	// // 递归到0了，说明这是一种解法。
	// if (n == 0) {
	// count++;
	// return;
	// }
	// // 当前的青蛙可能是从n-1处跳过来，也可能是从n-2处跳过来
	// if (n >= 1)
	// fun(n - 1);
	// if (n >= 2)
	// fun(n - 2);
	// }
	// 方法二
	static int fun2(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return fun2(n - 1) + fun2(n - 2);
	}

	// 使用迭代
	public int JumpFloor(int n) {
		int a = 1, b = 2, c = 0;
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		/*
		 * fun(4); System.out.println(count); count = 0; fun(5);
		 * System.out.println(count); count = 0;
		 */
		System.out.println(fun2(20));
	}
}
