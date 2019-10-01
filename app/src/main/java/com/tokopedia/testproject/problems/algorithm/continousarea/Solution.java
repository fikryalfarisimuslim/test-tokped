package com.tokopedia.testproject.problems.algorithm.continousarea;

import android.util.Log;

public class Solution {
    public static int maxContinuousArea(int[][] matrix) {
        // TODO, return the largest continuous area containing the same integer, given the 2D array with integers
        // below is stub
        int maxContinuesArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxContinuesArea = Math.max(findLargestRegion(matrix, matrix[i][j], i, j), maxContinuesArea);
            }
        }
        Log.d("Result", ""+maxContinuesArea);

        return maxContinuesArea;
    }

    private static int findLargestRegion(int[][] matrix, int number, int row, int col) {
        int totalAreaRight;
        int totalAreaLeft;

        boolean[][] booleans = new boolean[matrix.length][matrix[0].length];

        int tempTotal = 0;
        int totalArea = 0;

        for (int i = row; i < matrix.length; i++) {
            totalAreaRight = 0;
            totalAreaLeft = 0;

            for (int j = col; j < matrix[0].length; j++) {
                if (number == matrix[i][j]) {
                    totalAreaRight += 1;
                } else
                    break;
            }

            if (i != row && col > 0) {
                for (int j = col - 1; j >= 0; j--) {
                    if (number == matrix[i][j]) {
                        totalAreaLeft += 1;
                    } else
                        break;
                }
            }
            tempTotal += totalAreaRight + totalAreaLeft;

            if (i == matrix.length - 1) {
                totalArea = Math.max(tempTotal, totalArea);
                break;
            }
        }

        return totalArea;
    }
}
