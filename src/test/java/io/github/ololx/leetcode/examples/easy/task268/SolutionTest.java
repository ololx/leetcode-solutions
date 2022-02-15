package io.github.ololx.leetcode.examples.easy.task268;

import io.github.ololx.leetcode.examples.easy.task268.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.02.2022 11:14
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "nums")
    public static Object[][] nums() {
        return new Object[][] {
                {new int[] {3,0,1}, 2},
                {new int[] {0,1}, 2},
                {new int[] {9,6,4,2,3,5,7,0,1}, 8}
        };
    }

    @Test(dataProvider = "nums")
    public void missingNumber_whenArrayIsNotEmpty_thenReturnNonZeroMissingNumber(int[] nums, int missingNumber) {
        assertEquals(new Solution().missingNumber(nums), missingNumber);
    }
}
