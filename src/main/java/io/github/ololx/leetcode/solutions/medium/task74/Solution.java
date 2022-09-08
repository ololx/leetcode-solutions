package io.github.ololx.leetcode.solutions.medium.task74;

/**
 * 74. Search a 2D Matrix
 *
 * Write an efficient algorithm that searches for a value target in an m x n
 * integer matrix matrix. This matrix has the following properties:
 * <ul>
 *     <li>
 *         Integers in each row are sorted from left to right.
 *     </li>
 *     <li>
 *         The first integer of each row is greater than the last integer of the previous row.
 *     </li>
 * </ul>
 *
 * Example 1:
 * <p>Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true</p>
 *
 * Example 2:
 * <p>Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          m == matrix.length
 *      </li>
 *      <li>
 *          n == matrix[i].length
 *      </li>
 *      <li>
 *          1 <= m, n <= 100
 *      </li>
 *      <li>
 *          -104 <= matrix[i][j], target <= 104
 *      </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 31.03.2022 16:32
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int[] row = new int[0];
        for (int[] currentRow : matrix) {
            if (currentRow[0] == target || currentRow[currentRow.length - 1] == target) {
                return true;
            }

            if (currentRow[0] < target && currentRow[currentRow.length - 1] > target) {
                row = currentRow;
                break;
            }
        }

        int left = 0, right = row.length - 1;
        while (left <= right) {
            int median = (left + right) / 2;

            if (row[median] > target) {
                right = median - 1;
            } else if (row[median] < target) {
                left = median + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
