package io.github.ololx.leetcode.solutions.easy.task463;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 14/05/2024 5:36pm
 */
public class SolutionV2Test extends AbstractSolutionTest {

    @LogParam
    @Test(timeOut = 1000L, dataProvider = "providesMaps")
    public void islandPerimeter_whenIslandExists_thenReturnPerimeter(int[][] grid, int expected) {
        assertEquals(new SolutionV2().islandPerimeter(grid), expected);
    }
}