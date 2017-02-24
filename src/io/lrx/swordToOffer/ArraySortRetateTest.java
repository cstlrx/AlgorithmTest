package io.lrx.swordToOffer;

import java.util.ArrayList;

/**
 * @author lrx
 * @time 2016-11-6上午11:29:29
 */
/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE： 给出的所有元素都大于0，若数组大小为0，请返回0。
 */
/*
 * 思路：从第一个元素开始遍历数组，设置一个变量min； 若min的下一个元素比min小，就输出，若至结尾也没有比min小的就输出第一个元素。 时间复杂度
 * 最多O(N)
 */
/*
 * 然而并不能好好玩，时间138ms 大神<1ms，算法差不多呀，把他的输进去也是这么多ms,原来人家时C++
 */
/*
 * 二分查找的溢出问题，int mid = (right+left)/2; 若right+left超过整数的表示范围则溢出 故用int mid =
 * left+(right-left)>>>1;代替,右移一位相当于除以2
 */
public class ArraySortRetateTest {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				return array[i];
			}
		}
		return array[0];
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> oneWay = new ArrayList<Integer>();
		
		oneWay.add(1);
		result.add(oneWay);
		result.re
	}
}
