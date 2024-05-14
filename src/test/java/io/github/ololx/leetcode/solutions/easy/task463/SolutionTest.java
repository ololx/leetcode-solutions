package io.github.ololx.leetcode.solutions.easy.task463;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 14/05/2024 5:36pm
 */
public class SolutionTest {

    @DataProvider(name = "providesMaps")
    public static Object[][] providesMaps() {
        return new Object[][] {
            {
                new int[][] {
                    {0, 1, 0, 0},
                    {1, 1, 1, 0},
                    {0, 1, 0, 0},
                    {1, 1, 0, 0}
                },
                16
            },
            {
                new int[][] {{1}},
                4
            },
            {
                new int[][] {{1, 0}},
                4
            }
        };
    }

    @LogParam
    @Test(timeOut = 1000L, dataProvider = "providesMaps")
    public void islandPerimeter_whenIslandExists_thenReturnPerimeter(int[][] grid, int expected) {
        assertEquals(new Solution().islandPerimeter(grid), expected);
    }
}