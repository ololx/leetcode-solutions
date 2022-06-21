package io.github.ololx.leetcode.examples.medium.task304;

/**
 * 304. Range Sum Query 2D - Immutable
 *
 * Given a 2D matrix matrix, handle multiple queries of the following type:
 * <ul>
 *     <li>
 *         Calculate the sum of the elements of matrix inside the rectangle
 *         defined by its upper left corner (row1, col1)
 *         and lower right corner (row2, col2).
 *     </li>
 * </ul>
 *
 * Implement the NumMatrix class:
 * <ul>
 *     <li>
 *         NumMatrix(int[][] matrix) Initializes the object with
 *         the integer matrix matrix.
 *     </li>
 *     <li>
 *         int sumRegion(int row1, int col1, int row2, int col2)
 *         Returns the sum of the elements of matrix inside the rectangle
 *         defined by its upper left corner (row1, col1)
 *         and lower right corner (row2, col2).
 *     </li>
 * </ul>
 *
 * Example1:
 * <p>Input
 * ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
 * [[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]],
 * [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
 * Output
 * [null, 8, 11, 12]
 *
 * Explanation
 * NumMatrix numMatrix = new NumMatrix([[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5],
 * [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]);
 * numMatrix.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
 * numMatrix.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
 * numMatrix.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         m == matrix.length
 *     </li>
 *     <li>
 *         n == matrix[i].length
 *     </li>
 *     <li>
 *         -10^4 <= matrix[i][j] <= 10^4
 *     </li>
 *     <li>
 *         0 <= row1 <= row2 < m
 *     </li>
 *     <li>
 *         0 <= col1 <= col2 < n
 *     </li>
 *     <li>
 *         At most 104 calls will be made to sumRegion.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 17.06.2022 14:26
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public static final class NumMatrix {

        private final int[][] values;

        public NumMatrix(int[][] matrix) {
            this.values = matrix;

            for (int rowIndex = 0; rowIndex < this.values.length; rowIndex++) {
                for (int colIndex = 1; colIndex < this.values[0].length; colIndex++) {
                    this.values[rowIndex][colIndex] += this.values[rowIndex][colIndex - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sumOfAllInRegion = 0;

            while (row1 <= row2) {
                sumOfAllInRegion += this.values[row1][col2];

                if (col1 > 0) {
                    sumOfAllInRegion -= this.values[row1][col1 - 1];
                }

                row1++;
            }

            return sumOfAllInRegion;
        }
    }
}
