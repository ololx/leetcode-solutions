package io.github.ololx.leetcode.solutions.medium.task55;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 06/05/2024 10:03 am
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
            {new int[] {2, 3, 1, 1, 4}, true},
            {new int[] {3, 2, 1, 0, 4}, false},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesNums")
    public void canJump_whenEndOfArrayIsReachable_thenReturnTrue(int[] nums, boolean expected) {
        assertEquals(new Solution().canJump(nums), expected);
    }
}