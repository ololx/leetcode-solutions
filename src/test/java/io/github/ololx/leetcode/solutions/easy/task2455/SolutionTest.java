package io.github.ololx.leetcode.solutions.easy.task2455;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 20/11/2022 21:15
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {1, 3, 6, 10, 12, 15}, 9},
                {new int[] {1, 2, 4, 7, 10}, 0}
        };
    }

    //@LogParam
    @Test(dataProvider = "providesNums")
    public void averageValue_whenEventDivisibleBy3AreExist_thenReturnAverageOfAll(int[] nums,
                                                                                  int expected) {
        assertEquals(new Solution().averageValue(nums), expected);
    }
}
