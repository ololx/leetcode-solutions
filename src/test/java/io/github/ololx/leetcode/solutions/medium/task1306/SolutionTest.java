package io.github.ololx.leetcode.solutions.medium.task1306;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task1306.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 08/05/2024 9:29am
 */
public class SolutionTest {

    @DataProvider(name = "providesArrays")
    public static Object[][] providesArrays() {
        return new Object[][] {
            {new int[] {4, 2, 3, 0, 3, 1, 2}, 5, true},
            {new int[] {4, 2, 3, 0, 3, 1, 2}, 0, true},
            {new int[] {3, 0, 2, 1, 2}, 2, false},
        };
    }

    @LogParam
    @Test(dataProvider = "providesArrays")
    public void canReach_whenZeroArrayValueIsReachable_thenReturnTrue(int[] nums, int start, boolean expected) {
        assertEquals(new Solution().canReach(nums, start), expected);
    }
}