package io.github.ololx.leetcode.solutions.medium.task64;

/**
 * 64. Minimum Path Sum
 *
 * Given a m x n grid filled with non-negative numbers, find a path
 * from top left to bottom right, which minimizes the sum of all numbers along its path.
 *
 * Note: You can only move either down or right at any point in time.
 *
 * Example 1:
 * <p>Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.</p>
 *
 * Example 2:
 * <p>Input: grid = [[1,2,3],[4,5,6]]
 * Output: 12</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         m == grid.length
 *     </li>
 *     <li>
 *         n == grid[i].length
 *     </li>
 *     <li>
 *         1 <= m, n <= 200
 *     </li>
 *     <li>
 *         0 <= grid[i][j] <= 100
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 15.02.2022 17:43
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        for (int x = 1; x <= grid.length - 1; x++) {
            grid[x][0] += grid[x - 1][0];
        }

        for (int y = 1; y <= grid[0].length - 1; y++) {
            grid[0][y] += grid[0][y - 1];
        }

        for (int x = 1; x <= grid.length - 1; x++) {
            for (int y = 1; y <= grid[0].length - 1; y++) {
                grid[x][y] += Math.min(grid[x - 1][y], grid[x][y - 1]);
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}
