package io.github.ololx.leetcode.solutions.easy.task1480;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 01.06.2022 21:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {1, 2, 3, 4}, new int[] {1, 3, 6, 10}},
                {new int[] {1, 1, 1, 1, 1}, new int[] {1, 2, 3, 4, 5}},
                {new int[] {3, 1, 2, 10, 1}, new int[] {3, 4, 6, 16, 17}},
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNums")
    public void runningSum_whenNumsMoreThenOne_thenReturnSumOfAll(int[] nums, int[] expected) {
        assertEquals(new Solution().runningSum(nums), expected);
    }
}
