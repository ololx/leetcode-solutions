package io.github.ololx.leetcode.solutions.easy.task27;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task27.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.12.2022 12:22
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {3, 2, 2, 3}, 3, 2},
                {new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2, 5}
        };
    }

    @LogParam
    @Test(dataProvider = "providesNums")
    public void removeElement_whenElementsWereRemoved_thenReturnCountOfStayingElements(int[] nums,
                                                                                       int val,
                                                                                       int expected) {
        assertEquals(new Solution().removeElement(nums, val), expected);
    }
}
