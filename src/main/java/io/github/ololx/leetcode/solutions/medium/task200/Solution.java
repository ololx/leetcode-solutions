package io.github.ololx.leetcode.solutions.medium.task200;

/**
 * 200. Number of Islands
 *
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of
 * islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may
 * assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 * <p>Input: grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1</p>
 *
 * Example 2:
 * <p>Input: grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          m == grid.length
 *      </li>
 *      <li>
 *          n == grid[i].length
 *      </li>
 *      <li>
 *          1 <= m, n <= 300
 *      </li>
 *      <li>
 *          grid[i][j] is '0' or '1'.
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 12/05/2024 14:34
 */
public class Solution {

    public int numIslands(char[][] grid) {
        int islands = 0;

        for (var x = 0; x < grid.length; x++) {
            for (var y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == '1') {
                    islands++;
                    researchIsland(grid, x, y);
                }
            }
        }

        return islands;
    }

    private void researchIsland(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length) {
            return;
        }

        if (grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';
        researchIsland(grid, x + 1, y);
        researchIsland(grid, x - 1, y);
        researchIsland(grid, x, y + 1);
        researchIsland(grid, x, y - 1);
    }
}
