package io.github.ololx.leetcode.solutions.medium.task260;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task260.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.05.2023 15:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {1, 2, 1, 3, 2, 5}, new int[] {3, 5}},
                {new int[] {-1, 0}, new int[] {-1, 0}},
                {new int[] {0, 1}, new int[] {1, 0}},
        };
    }

    @LogParam
    @Test(dataProvider = "providesNums")
    public void singleNumber_whenNumsContainsTwoSingleNumbers_thenReturnAll(int[] nums,
                                                                            int[] expected) {
        assertEquals(new Solution().singleNumber(nums), expected);
    }
}
