package io.github.ololx.leetcode.examples.medium.task64;

import io.github.ololx.leetcode.examples.medium.task64.Solution;
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
                        {1, 2, 5},
                        {3, 2, 1}
                }, 6},
                {new int[][] {
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
                }, 7},
                {new int[][] {
                        {1, 2, 3},
                        {4, 5, 6}
                }, 12}
        };
    }

    @Test(dataProvider = "fieldsAndPaths")
    public void minPathSum_whenRobotAneExitAreNotSameCell_thenReturnNonZeroMinPathCost(int[][] obstacleGrid, int pathCost) {
        assertEquals(new Solution().minPathSum(obstacleGrid), pathCost);
    }
}
