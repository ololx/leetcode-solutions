package io.github.ololx.leetcode.solutions.easy.task26;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 21.05.2022 10:54
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {1, 1, 2}, 2},
                {new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5},
        };
    }

    @Test(dataProvider = "providesNums")
    public void addDigits_whenNumHigherZero_thenReturnDigitalRoot(int[] nums, int expected) {
        assertEquals(new Solution().removeDuplicates(nums), expected);
    }
}
