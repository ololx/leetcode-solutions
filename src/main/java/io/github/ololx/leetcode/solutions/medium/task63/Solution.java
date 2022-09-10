package io.github.ololx.leetcode.solutions.medium.task63;

/**
 * 63. Unique Paths II
 *
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying
 * to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths
 * would there be?
 *
 * An obstacle and space is marked as 1 and 0 respectively in the grid.
 *
 * Example 1:
 * <p>Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -> Right -> Down -> Down
 * 2. Down -> Down -> Right -> Right</p>
 *
 * Example 2:
 * <p>Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         m == obstacleGrid.length
 *     </li>
 *     <li>
 *         n == obstacleGrid[i].length
 *     </li>
 *     <li>
 *         1 <= m, n <= 100
 *     </li>
 *     <li>
 *         obstacleGrid[i][j] is 0 or 1.
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.02.2022 17:18
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePaths(obstacleGrid, obstacleGrid.length -1, obstacleGrid[0].length -1);
    }

    public int uniquePaths(int[][] field, int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }

        if (field[x][y] == 1) {
            return 0;
        }

        if (x == 0 && y == 0) {
            return 1;
        }

        if (field[x][y] == 0) {
            field[x][y] -= uniquePaths(field, x - 1, y);
            field[x][y] -= uniquePaths(field, x, y - 1);
        }

        return  field[x][y] * -1;
    }
}
