package io.github.ololx.leetcode.solutions.medium.task695;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 13/05/2024 7:10am
 */
public class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxAreaOfIsland = 0;

        for (var x = 0; x < grid.length; x++) {
            for (var y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == 1) {
                    maxAreaOfIsland = Math.max(maxAreaOfIsland, calcAreaOfIsland(grid, x, y));
                }
            }
        }

        return maxAreaOfIsland;
    }

    private int calcAreaOfIsland(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length) {
            return 0;
        }

        if (grid[x][y] == 0) {
            return 0;
        }

        grid[x][y] = 0;

        var areaOfIsland = 1;
        areaOfIsland += calcAreaOfIsland(grid, x + 1, y);
        areaOfIsland += calcAreaOfIsland(grid, x - 1, y);
        areaOfIsland += calcAreaOfIsland(grid, x, y + 1);
        areaOfIsland += calcAreaOfIsland(grid, x, y - 1);

        return areaOfIsland;
    }
}
