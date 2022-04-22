package io.github.ololx.leetcode.examples.medium.task54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 54. Spiral Matrix
 *
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 *
 * Example 1:
 * <p>Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]</p>
 *
 * Example 2:
 * <p>Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]</p>
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
 *          1 <= m, n <= 10
 *      </li>
 *      <li>
 *          -100 <= matrix[i][j] <= 100
 *      </li>
 * </ul>
 */
public class SolutionV2 {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return Collections.emptyList();
        }

        int x = 0, y = 0;
        int m = matrix.length, n = matrix[y].length;

        List<Integer> spiralOrderedList = new ArrayList<>();
        int[][] spiralVisitedMatrix = new int[m][n];

        for (int spiralIndex = 0; spiralIndex < n * m; spiralIndex++) {
            if (x + 1 < n && (y == 0 || spiralVisitedMatrix[y - 1][x] != 0 && spiralVisitedMatrix[y][x + 1] == 0)) {
                spiralVisitedMatrix[y][x] += 1;
                spiralOrderedList.add(matrix[y][x]);
                x++;
            } else if (y + 1 < m &&  (x == n - 1 || spiralVisitedMatrix[y][x + 1] != 0 && spiralVisitedMatrix[y + 1][x] == 0)) {
                spiralVisitedMatrix[y][x] += 1;
                spiralOrderedList.add(matrix[y][x]);
                y++;
            } else if (x > 0 && (y == m - 1 || spiralVisitedMatrix[y + 1][x] != 0 && spiralVisitedMatrix[y][x - 1] == 0)) {
                spiralVisitedMatrix[y][x] += 1;
                spiralOrderedList.add(matrix[y][x]);
                x--;
            } else if (y > 0 && (x == 0 || spiralVisitedMatrix[y][x - 1] != 0 && spiralVisitedMatrix[y - 1][x] == 0)) {
                spiralVisitedMatrix[y][x] += 1;
                spiralOrderedList.add(matrix[y][x]);
                y--;
            } else {
                spiralVisitedMatrix[y][x] += 1;
                spiralOrderedList.add(matrix[y][x]);
            }
        }

        return spiralOrderedList;
    }
}
