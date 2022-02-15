package io.github.ololx.leetcode.examples.medium.task62;

import io.github.ololx.leetcode.examples.medium.task62.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.02.2022 10:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "fieldsAndPaths")
    public static Object[][] fieldsAndPaths() {
        return new Object[][] {
                {3, 2, 3},
                {3, 7, 28}
        };
    }

    @Test(dataProvider = "fieldsAndPaths")
    public void uniquePaths_whenRobotAneExitAreNotSameCell_thenReturnNonZeroNumberOfUniqueWays(int m, int n, int pathsCount) {
        assertEquals(new Solution().uniquePaths(m, n), pathsCount);
    }
}
