package io.github.ololx.leetcode.examples.medium.task63;

import io.github.ololx.leetcode.examples.medium.task63.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.02.2022 16:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "fieldsAndPaths")
    public static Object[][] fieldsAndPaths() {
        return new Object[][] {
                {new int[][] {
                        {0, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 0}
                }, 7},
                {new int[][] {
                        {0, 1},
                        {0, 0}
                }, 1},
                {new int[][] {
                        {0, 0, 0},
                        {0, 1, 0},
                        {0, 0, 0}
                }, 2}
        };
    }

    @Test(dataProvider = "fieldsAndPaths")
    public void uniquePathsWithObstacles_whenRobotAneExitAreNotSameCell_thenReturnNonZeroNumberOfUniqueWays(int[][] obstacleGrid, int pathsCount) {
        assertEquals(new Solution().uniquePathsWithObstacles(obstacleGrid), pathsCount);
    }
}
