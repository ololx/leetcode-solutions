package io.github.ololx.leetcode.solutions.medium.task695;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * 695. Max Area of Island
 *
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally
 * (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 *
 * Example 1:
 * <p>Input: grid =
 * [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,1,1,0,1,0,0,0,0,0,0,0,0],
 * [0,1,0,0,1,1,0,0,1,0,1,0,0],
 * [0,1,0,0,1,1,0,0,1,1,1,0,0],
 * [0,0,0,0,0,0,0,0,0,0,1,0,0],
 * [0,0,0,0,0,0,0,1,1,1,0,0,0],
 * [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.</p>
 *
 * Example 2:
 * <p>Input: grid = [[0,0,0,0,0,0,0,0]]
 * Output: 0</p>
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
 *          1 <= m, n <= 50
 *      </li>
 *      <li>
 *          grid[i][j] is either 0 or 1.
 *      </li>
 * </ul>
 *
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 13/05/2024 7:32am
 */
public class SolutionTest {

    @DataProvider(name = "providesIslands")
    public static Object[][] providesIslands() {
        return new Object[][]{
            {
                new int[][]{
                    {1, 1, 1, 1, 0},
                    {1, 1, 0, 1, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0}
                },
                9
            },
            {
                new int[][]{
                    {1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 1, 0, 0},
                    {0, 0, 0, 1, 1}
                },
                4
            },
        };
    }

    @LogParam
    @Test(dataProvider = "providesIslands")
    public void maxAreaOfIsland_whenIslandsExist_thenReturnMaxArea(int[][] grid, int expected) {
        assertEquals(new Solution().maxAreaOfIsland(grid), expected);
    }
}