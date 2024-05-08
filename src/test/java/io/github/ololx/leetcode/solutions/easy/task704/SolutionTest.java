package io.github.ololx.leetcode.solutions.easy.task704;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 02.08.2023 16:31
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesNumsAndTarget() {
        return new Object[][]{
                {new int[]{-1, 0, 3, 5, 9, 12}, 9, 4},
                {new int[]{-1, 0, 3, 5, 9, 12}, 2, -1},
        };
    }

    @LogParam
    @Test(dataProvider = "providesNumsAndTarget")
    public void search_whenNumsContainsTarget_thenReturnTarget(int[] nums, int target, int expected) {
        assertEquals(new Solution().search(nums, target), expected);
    }
}
