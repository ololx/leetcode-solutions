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
 * created 09.05.2023 11:12
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        //check if input data is incorrect
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        //start from top-right of the matrix
        // and go to the left-and-down
        // while indexes in bounds of m,n or don't find target
        int rowIndex = 0;
        int columnIndex = matrix[0].length - 1;
        while (columnIndex >= 0 && rowIndex <= matrix.length - 1) {
            int currentValue = matrix[rowIndex][columnIndex];
            if (currentValue == target) {
                return true;
            }

            if (currentValue < target) {
                rowIndex++;
            } else {
                columnIndex--;
            }
        }

        return false;
    }
}
