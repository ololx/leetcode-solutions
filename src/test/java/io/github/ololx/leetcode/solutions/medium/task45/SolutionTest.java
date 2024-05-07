package io.github.ololx.leetcode.solutions.medium.task45;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task45.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/05/2024 1:50pm
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
            {new int[] {2, 3, 1, 1, 4}, 2},
            {new int[] {2, 3, 0, 1, 4}, 2},
        };
    }

    @LogParam
    @Test(dataProvider = "providesNums")
    public void canJump_whenEndOfArrayIsReachable_thenReturnTrue(int[] nums, int expected) {
        assertEquals(new Solution().jump(nums), expected);
    }
}