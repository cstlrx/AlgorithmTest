package io.lrx.swordToOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lrx
 * @time 2017-2-25ÉÏÎç11:39:08
 */
public class Permutation {
	static Set<String> result = new HashSet<String>();
	char[] charArray;
	static char[] aString;
	static boolean[] flag;

	public ArrayList<String> permutation(String str) {
		ArrayList<String> r = new ArrayList<String>();
		if (str.length() == 0)
			return r;
		if (str.length() == 1) {
			r.add(str);
			return r;
		}
		flag = new boolean[str.length()];
		aString = new char[str.length()];
		charArray = new char[str.length()];
		charArray = str.toCharArray();

		Permutation(charArray, 0);

		r.addAll(result);
		return r;
	}

	public static void Permutation(char[] array, int index) {
		if (index == array.length) {
			// result.add(aString.toString());
			String str = "";
			for (int i = 0; i < array.length; i++) {
				str += aString[i];
			}
			result.add(str);
			return;
		}
		for (int i = 0; i < array.length; i++) {
			if (!flag[i]) {
				aString[index] = array[i];
				flag[i] = true;
				Permutation(array, index + 1);
				flag[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		Permutation p = new Permutation();
		p.permutation("aa");
	}
}
