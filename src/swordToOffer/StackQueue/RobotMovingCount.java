package swordToOffer.StackQueue;

import java.util.LinkedList;

/**
 * Created by lrx on 2017/4/8.
 */
/*
地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class RobotMovingCount {
    private static int rcToIndex(int row, int col, int cols) {
        return row * cols + col;
    }
    private static boolean isValid(int row, int col, int rows, int cols) {
        if (row < 0 || col < 0) return false;
        if (row > rows-1 || col > cols-1) return false;
        return true;
    }
    private static boolean isValid(int row, int col, int k) {
        int res = 0;
        while (row != 0) {
            res += (row % 10);
            row /= 10;
        }
        while (col != 0) {
            res += (col % 10);
            col /= 10;
        }
        if (res > k) return false;
        return true;
    }
    public int movingCount(int threshold, int rows, int cols)
    {
        LinkedList<Integer> queue = new LinkedList<>();
        int row = 0;
        int col = 0;
        int index = rcToIndex(row, col, cols);
        int res = 0;
        boolean[][] flag = new boolean[rows][cols];
        if (isValid(row, col, threshold)) {
            flag[row][col] = true;
            queue.add(index);
            res++;
        }
        while (!queue.isEmpty()) {
            index = queue.removeFirst();
            row = index / cols;
            col = index % cols;
            if (isValid(row,col+1,rows,cols) && !flag[row][col+1] && isValid(row,col+1,threshold)) {
                flag[row][col+1] = true;
                queue.add(rcToIndex(row,col+1,cols));
                res++;
            }
            if (isValid(row+1,col,rows,cols) && !flag[row+1][col] && isValid(row+1,col,threshold)) {
                flag[row+1][col] = true;
                queue.add(rcToIndex(row+1,col,cols));
                res++;
            }
            if (isValid(row,col-1,rows,cols) && !flag[row][col-1] && isValid(row,col-1,rows,cols) && isValid(row,col-1,threshold)) {
                flag[row][col-1] = true;
                queue.add(rcToIndex(row,col-1,cols));
                res++;
            }
            if (isValid(row-1,col,rows,cols) && !flag[row-1][col] && isValid(row-1,col,threshold)) {
                flag[row-1][col] = true;
                queue.add(rcToIndex(row-1,col,cols));
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RobotMovingCount r = new RobotMovingCount();
        int res = r.movingCount(5,10,10);
        System.out.println(res);
    }
}
