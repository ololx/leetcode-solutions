package io.github.ololx.leetcode.examples.medium.task59;

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
public class SolutionV2 {

    public int[][] generateMatrix(int n) {
        if (n <= 0) {
            return new int[0][0];
        }

        int[][] spiralMatrix = new int[n][n];

        int x = 0, y = 0;
        for (int spiralIndex = 0; spiralIndex < n * n; spiralIndex++) {
            if (x + 1 < n && (y == 0 || spiralMatrix[y - 1][x] != 0 && spiralMatrix[y][x + 1] == 0)) {
                spiralMatrix[y][x] = spiralIndex + 1;
                x++;
            } else if (y + 1 < n &&  (x == n - 1 || spiralMatrix[y][x + 1] != 0 && spiralMatrix[y + 1][x] == 0)) {
                spiralMatrix[y][x] = spiralIndex + 1;
                y++;
            } else if (x > 0 && (y == n - 1 || spiralMatrix[y + 1][x] != 0 && spiralMatrix[y][x - 1] == 0)) {
                spiralMatrix[y][x] = spiralIndex + 1;
                x--;
            } else if (y > 0 && (x == 0 || spiralMatrix[y][x - 1] != 0 && spiralMatrix[y - 1][x] == 0)) {
                spiralMatrix[y][x] = spiralIndex + 1;
                y--;
            } else {
                spiralMatrix[y][x] = spiralIndex + 1;
            }
        }

        return spiralMatrix;
    }
}
