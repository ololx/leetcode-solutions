package io.github.ololx.leetcode.examples.easy.task1;

import io.github.ololx.leetcode.examples.easy.task1.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 24.02.2022 21:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "numbersAndSum")
    public static Object[][] numbersAndSum() {
        return new Object[][] {
                {new int[] {2,7,11,15}, 9, new int[] {0, 1}},
                {new int[] {3,2,4}, 6, new int[] {1, 2}},
                {new int[] {3,3}, 6, new int[] {0, 1}}
        };
    }

    @Test(dataProvider = "numbersAndSum")
    public void twoSum_whenTwoSumIsExists_thenReturnTwoSum(int[] nums, int target, int[] result) {
        assertEquals(new Solution().twoSum(nums, target), result);
    }
}
