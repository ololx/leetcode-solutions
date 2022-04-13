package io.github.ololx.leetcode.examples.medium.task59;

/**
 * 59. Spiral Matrix II
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        if (n <= 0) {
            return new int[0][0];
        }

        int[][] spiralSQRMatrix = new int[n][n];

        int x = 0, y = 0;
        int mxx = n -1, mxy = n - 1;
        int mnx = 0, mny = 0;

        int stepNumber = 1;

        while (stepNumber <= n * n) {

            //right --->
            while (x <= mxx) {
                spiralSQRMatrix[y][x] = stepNumber;
                stepNumber++;
                x++;
            }

            x--;
            mxx--;
            y++;

            //bottom v
            while (y <= mxy) {
                spiralSQRMatrix[y][x] = stepNumber;
                stepNumber++;
                y++;
            }

            y--;
            mxy--;
            x--;

            //left <---
            while (x >= mnx) {
                spiralSQRMatrix[y][x] = stepNumber;
                stepNumber++;
                x--;
            }

            x++;
            mnx++;
            y--;
            mny++;

            //top ^
            while (y >= mny) {
                spiralSQRMatrix[y][x] = stepNumber;
                stepNumber++;
                y--;
            }

            y++;
            mny++;
            x++;
        }

        return spiralSQRMatrix;
    }
}
