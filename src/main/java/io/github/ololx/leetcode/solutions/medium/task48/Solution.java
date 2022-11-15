package io.github.ololx.leetcode.solutions.medium.task48;

/**
 * 48. Rotate Image
 *
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have to modify
 * the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 *
 * Example 1:
 * <p>Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]</p>
 *
 * Example 2:
 * <p>Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         n == matrix.length == matrix[i].length
 *     </li>
 *     <li>
 *         1 <= n <= 20
 *     </li>
 *     <li>
 *         -1000 <= matrix[i][j] <= 1000
 *     </li>
 * </ul>
 *
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
