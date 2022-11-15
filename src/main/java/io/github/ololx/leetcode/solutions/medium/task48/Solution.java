package io.github.ololx.leetcode.solutions.medium.task48;

/**
 * project leetcode-solutions
 * created 15.11.2022 13:21
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                int value = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = value;
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n / 2; col++) {
                int value = matrix[row][col];
                matrix[row][col] = matrix[row][n - col - 1];
                matrix[row][n - col - 1] = value;
            }
        }
    }
}
