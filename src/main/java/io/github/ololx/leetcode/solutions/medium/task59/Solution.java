package io.github.ololx.leetcode.solutions.medium.task59;

/**
 * 59. Spiral Matrix II
 *
 * Given a positive integer n, generate an n x n matrix filled
 * with elements from 1 to n2 in spiral order.
 *
 * Example 1:
 * <p>Input: n = 3
 * Output: [[1,2,3],[8,9,4],[7,6,5]]</p>
 *
 * Example 2:
 * <p>Input: n = 1
 * Output: [[1]]</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          1 <= n <= 20
 *      </li>
 * </ul>
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        if (n <= 0) {
            return new int[0][0];
        }

        int[][] spiralMatrix = new int[n][n];

        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int stepNumber = 0;

        while (left <= right && top <= bottom) {

            //mov to right
            for (int i = left; i <= right; i++) {
                spiralMatrix[top][i] = ++stepNumber;
            }

            top++;

            //mov to bottom
            for (int i = top; i <= bottom; i++) {
                spiralMatrix[i][right] = ++stepNumber;
            }

            right--;

            //mov to left
            for (int i = right; i >= left; i--) {
                spiralMatrix[bottom][i] = ++stepNumber;
            }

            bottom--;

            //mov to top
            for (int i = bottom; i >= top; i--) {
                spiralMatrix[i][left] = ++stepNumber;
            }

            left++;
        }

        return spiralMatrix;
    }
}
