package io.lrx.swordToOffer;

import java.util.ArrayList;

/**
 * @author lrx
 * @time 2016-11-6����11:29:29
 */
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� NOTE�� ����������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
/*
 * ˼·���ӵ�һ��Ԫ�ؿ�ʼ�������飬����һ������min�� ��min����һ��Ԫ�ر�minС���������������βҲû�б�minС�ľ������һ��Ԫ�ء� ʱ�临�Ӷ�
 * ���O(N)
 */
/*
 * Ȼ�������ܺú��棬ʱ��138ms ����<1ms���㷨���ѽ�����������ȥҲ����ô��ms,ԭ���˼�ʱC++
 */
/*
 * ���ֲ��ҵ�������⣬int mid = (right+left)/2; ��right+left���������ı�ʾ��Χ����� ����int mid =
 * left+(right-left)>>>1;����,����һλ�൱�ڳ���2
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
