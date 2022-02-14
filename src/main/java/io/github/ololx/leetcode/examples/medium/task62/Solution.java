package io.github.ololx.leetcode.examples.medium.task62;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 62. Unique Paths
 *
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that
 * the robot can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 10^9.
 *
 * Example 1:
 * <p>Input: m = 3, n = 7
 * Output: 28</p>
 *
 * Example 2:
 * <p>Input: m = 3, n = 2
 * Output: 3
 * Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down</p>
 *
 * Constraints:
 * <ul>
 *     <li>
 *         1 <= m, n <= 100
 *     </li>
 * </ul>
 *
 * project leetcode-solutions
 * created 14.02.2022 10:14
 *
 * @author Alexander A. Kropotin
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] field = new int[m][n];

        return uniquePaths(field, m -1, n -1);
    }

    public int uniquePaths(int[][] field, int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }

        if (x == 0 && y == 0) {
            return 1;
        }

        if (field[x][y] == 0) {
            field[x][y] += uniquePaths(field, x - 1, y);
            field[x][y] += uniquePaths(field, x, y - 1);
        }

        return  field[x][y];
    }
}
