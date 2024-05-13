package io.github.ololx.leetcode.solutions.easy.task2220;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.06.2022 11:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStartAndGoal")
    public static Object[][] providesStartAndGoal() {
        return new Object[][] {
                {10, 7, 3},
                {3, 4, 3}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStartAndGoal")
    public void minBitFlips_whenStartIsNotEqualGoal_thenReturnMoreThanZero(int start,
                                                                           int goal,
                                                                           int expected) {
        assertEquals(new Solution().minBitFlips(start, goal), expected);
    }
}
