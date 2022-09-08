package io.github.ololx.leetcode.solutions.medium.task287;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 01.04.2022 13:46
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[]{1,3,4,2,2}, 2},
                {new int[]{3,1,3,4,2}, 3}
        };
    }

    @Test(dataProvider = "providesNums")
    public void findDuplicate_whenDuplicateInNums_thenReturnNum(int[] nums, int expected) {
        int actual = new Solution().findDuplicate(nums);

        assertTrue(actual == expected);
    }
}
