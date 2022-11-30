package io.github.ololx.leetcode.solutions.easy.task2475;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task2475.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 21/11/2022 21:48
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {4, 4, 2, 4, 3}, 3},
                {new int[] {1, 1, 1, 1, 1}, 0}
        };
    }

    @LogParam
    @Test(dataProvider = "providesNums")
    public void unequalTriplets_whenUnequalTripletsExist_thenReturnCountOfAll(int[] nums,
                                                                              int expected) {
        assertEquals(new Solution().unequalTriplets(nums), expected);
    }
}
