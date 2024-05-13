package io.github.ololx.leetcode.solutions.medium.task695;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 13/05/2024 7:32am
 */
public class SolutionTest {

    @DataProvider(name = "providesIslands")
    public static Object[][] providesIslands() {
        return new Object[][] {
            {
                new int[][] {
                    {1, 1, 1, 1, 0},
                    {1, 1, 0, 1, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0}
                },
                9
            },
            {
                new int[][] {
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