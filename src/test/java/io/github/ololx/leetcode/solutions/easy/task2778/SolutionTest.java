package io.github.ololx.leetcode.solutions.easy.task2778;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 02.08.2023 21:52
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesNums() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4}, 21},
                {new int[]{2, 7, 1, 19, 18, 3}, 63},
        };
    }

    //@LogParam
    @Test(dataProvider = "providesNums")
    public void search_whenNumsContainsTarget_thenReturnTarget(int[] nums, int expected) {
        assertEquals(new Solution().sumOfSquares(nums), expected);
    }
}
