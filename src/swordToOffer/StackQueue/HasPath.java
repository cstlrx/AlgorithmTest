package swordToOffer.StackQueue;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/8.
 */
public class HasPath {
    private static int indexToRow(int index, int cols) {
        return index / cols;
    }
    private static int indexToCol(int index, int cols) {
        return index % cols;
    }
    private static int rcToIndex(int row, int col, int cols) {
        return row * cols + col;
    }
    private static boolean isValid(int row, int col, int rows, int cols) {
        if (row < 0 || col < 0) return false;
        if (row > rows-1 || col > cols-1) return false;
        return true;
    }
    private static int next(char[] matrix, int row, int col, int rows, int cols, char[] str, int pos, boolean[] flag) {
        int index;
        if (isValid(row, col+1, rows, cols)) {
            index = rcToIndex(row, col+1, cols);
            if (!flag[index] && str[pos] == matrix[index]) {
                return index;
            }
        }
        if (isValid(row+1, col, rows, cols)) {
            index = rcToIndex(row+1, col, cols);
            if (!flag[index] && str[pos] == matrix[index]) {
                return index;
            }
        }
        if (isValid(row, col-1, rows, cols)) {
            index = rcToIndex(row, col-1, cols);
            if (!flag[index] && str[pos] == matrix[index]) {
                return index;
            }
        }
        if (isValid(row-1, col, rows, cols)) {
            index = rcToIndex(row-1, col, cols);
            if (!flag[index] && str[pos] == matrix[index]) {
                return index;
            }
        }
        return -1;
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        int row;
        int col;
        int index = 0;
        // 找到开始位置
        for (int i=0; i<matrix.length; i++) {
            if (matrix[i] == str[0]) {
                if (str.length == 1) return true;
                index = i;
                int pos = 1;
                row = indexToRow(index, cols);
                col = indexToCol(index, cols);
                Stack<Integer> stack = new Stack<>();
                stack.push(index);
                boolean[] flagArr = new boolean[matrix.length];
                flagArr[index] = true;
                while (!stack.isEmpty()) {
                    index = next(matrix, row, col, rows, cols, str, pos, flagArr);
                    // 没有下一个位置
                    if (index == -1) {
                        if (stack.isEmpty()) // 栈空结束
                            break;
                        index = stack.pop();
                        pos--;
                    } else {
                        if (pos == str.length - 1) // 找到这个串
                            return true;
                        flagArr[index] = true;// 已走过
                        stack.push(index);
                        pos++;
                    }
                    row = indexToRow(index, cols);
                    col = indexToCol(index, cols);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] matrix = new String
                ("ABCEH" +
                        "JIGSF" +
                        "CSLOP" +
                        "QADEE" +
                        "MNOEA" +
                        "DIDEJ" +
                        "FMVCE" +
                        "IFGGS").toCharArray();
        boolean res = hasPath(matrix, 5, 8, "SGGFIECVAASABCEHJIGQEMS".toCharArray());
        System.out.println(res);
    }
}
