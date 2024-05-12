package io.github.ololx.leetcode.solutions.medium.task200;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 * project leetcode-solutions
 * created 12/05/2024 14:37
 */
public class SolutionTest {

    @DataProvider(name = "providesIslands")
    public static Object[][] providesIslands() {
        return new Object[][] {
            {
                new char[][] {
                    {'1', '1', '1', '1', '0'},
                    {'1', '1', '0', '1', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '0', '0', '0'}
                },
                1
            },
            {
                new char[][] {
                    {'1', '1', '0', '0', '0'},
                    {'1', '1', '0', '0', '0'},
                    {'0', '0', '1', '0', '0'},
                    {'0', '0', '0', '1', '1'}
                },
                3
            },
        };
    }

    @LogParam
    @Test(dataProvider = "providesIslands")
    public void numIslands_whenIslandsExist_thenReturnNonZeroNum(char[][] grid, int expected) {
        assertEquals(new Solution().numIslands(grid), expected);
    }
}