package swordToOffer;

/**
 * @author lrx
 * @time 2017-2-9ионГ11:51:27
 */
public class TwoArrayFind {
	public static boolean Find(int target, int[][] array) {
		boolean found = false;
		if (array.length <= 0) {
			return found;
		}
		int row = array.length - 1;
		int col = 0;
		while (row >= 0 && col < array[0].length) {
			if (array[row][col] == target) {
				found = true;
				break;
			} else if (array[row][col] < target) {
				col++;
			} else {
				row--;
			}
		}

		return found;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };

		System.out.println(Find(1, array));
	}
}
