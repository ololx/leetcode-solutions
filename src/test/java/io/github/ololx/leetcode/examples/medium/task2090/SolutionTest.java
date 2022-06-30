package io.github.ololx.leetcode.examples.medium.task2090;

import io.github.ololx.leetcode.examples.medium.task2090.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 30.06.2022 16:06
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumsAndRadius")
    public static Object[][] providesNumsAndRadius() {
        return new Object[][] {
                {
                    new int[] {7, 4, 3, 9, 1, 8, 5, 2, 6},
                        3,
                        new int[] {-1, -1, -1, 5, 4, 4, -1, -1, -1}
                }
        };
    }

    @Test(dataProvider = "providesNumsAndRadius")
    public void getAverages_whenHeadNodeHasNext_thenReturnRotatedList(int[] nums,
                                                                      int k,
                                                                      int[] expected) {
        assertEquals(new Solution().getAverages(nums, k), expected);
    }
}
