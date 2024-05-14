package io.github.ololx.leetcode.solutions.easy.task463;

/**
 * 463. Island Perimeter
 *
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents
 * water.
 *
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and
 * there is exactly one island (i.e., one or more connected land cells).
 *
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is
 * a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of
 * the island.
 *
 * Example 1:
 * <p>Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
 * Output: 16
 * Explanation: The perimeter is the 16 yellow stripes in the image above.</p>
 *
 * Example 2:
 * <p>Input: grid = [[1]]
 * Output: 4</p>
 *
 * Example 3:
 * <p>Input: grid = [[1,0]]
 * Output: 4</p>
 *
 * Constraints:
 * <ul>
 *      <li>
 *          row == grid.length
 *      </li>
 *      <li>
 *          col == grid[i].length
 *      </li>
 *      <li>
 *          1 <= row, col <= 100
 *      </li>
 *      <li>
 *          grid[i][j] is 0 or 1.
 *      </li>
 *      <li>
 *          There is exactly one island in grid.
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 14/05/2024 5:35pm
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        for (var x = 0; x < grid.length; x++) {
            for (var y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == 1) {
                    return calcPerimeter(grid, x, y);
                }
            }
        }

        return 0;
    }

    private int calcPerimeter(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length) {
            return 0;
        }

        grid[x][y] = -1;

        int perimeter = 0;
        if (x == 0 || grid[x - 1][y] == 0) {
            perimeter++;
        } else if (grid[x - 1][y] == 1) {
            perimeter += calcPerimeter(grid, x - 1, y);
        }

        if (x == grid.length - 1 || grid[x + 1][y] == 0) {
            perimeter++;
        } else if (x < grid.length - 1 && grid[x + 1][y] == 1) {
            perimeter += calcPerimeter(grid, x + 1, y);
        }

        if (y == 0 || grid[x][y - 1] == 0) {
            perimeter++;
        } else if (grid[x][y - 1] == 1) {
            perimeter += calcPerimeter(grid, x, y - 1);
        }

        if (y == grid[x].length - 1 || grid[x][y + 1] == 0) {
            perimeter++;
        } else if (y < grid[x].length - 1 && grid[x][y + 1] == 1) {
            perimeter += calcPerimeter(grid, x, y + 1);
        }

        return perimeter;
    }
}
