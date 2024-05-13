package io.github.ololx.leetcode.solutions.medium.task11.task12;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task11.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 03.08.2023 15:24
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesHights() {
        return new Object[][]{
                {new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49},
                {new int[]{1, 1}, 1}
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesHights")
    public void maxArea_whenContainersMoreThanZero_thenReturnNonZeroVolume(int[] height, int expected) {
        assertEquals(new Solution().maxArea(height), expected);
    }
}
