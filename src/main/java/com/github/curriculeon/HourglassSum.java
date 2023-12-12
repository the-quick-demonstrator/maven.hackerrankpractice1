package com.github.curriculeon;

import java.util.stream.IntStream;
//    int[][] arr = {
//            {-9, -9, -9,  1, 1, 1},
//            { 0, -9,  0,  4, 3, 2},
//            {-9, -9, -9,  1, 2, 3},
//            { 0,  0,  8,  6, 6, 0},
//            { 0,  0,  0, -2, 0, 0},
//            { 0,  0,  1,  2, 4, 0}
//    };
public class HourglassSum {

    public static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int rowIndex = 0; rowIndex <= arr.length - 3; rowIndex++) {
            for (int columnINdex = 0; columnINdex <= arr[0].length - 3; columnINdex++) {
                final int[] currentHourGlass = getHourGlass(arr, rowIndex, columnINdex);
                final int currentSum = IntStream.of(currentHourGlass).sum();
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    public static int[] getHourGlass(int[][] arr, int row, int col) {
        int row1Col1 = arr[row][col];
        int row1Col2 = arr[row][col + 1];
        int row1Col3 = arr[row][col + 2];
        int row2Col2 = arr[row + 1][col + 1];
        int row3Col1 = arr[row + 2][col];
        int row3Col2 = arr[row + 2][col + 1];
        int row3Col3 = arr[row + 2][col + 2];
        int[] hourGlassValues = {
                row1Col1,
                row1Col2,
                row1Col3,
                row2Col2,
                row3Col1,
                row3Col2,
                row3Col3,
        };
        return hourGlassValues;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int maxSum = hourglassSum(arr);
        System.out.println("Maximum hourglass sum: " + maxSum);
    }
}
