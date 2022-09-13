package io.github.ololx.leetcode.solutions.easy.task2404;

import io.github.ololx.leetcode.solutions.easy.task2404.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.09.2022 06:54
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {0, 1, 2, 2, 4, 4, 1}, 2},
                {new int[] {4, 4, 4, 9, 2, 4}, 4},
                {new int[] {29, 47, 21, 41, 13, 37, 25, 7}, -1},
        };
    }

    @Test(dataProvider = "providesNums")
    public void mostFrequentEven_whenNumsHasEventElements_thenReturnMostFrequent(int[] nums,
                                                                                 int expected) {
        assertEquals(new Solution().mostFrequentEven(nums), expected);
    }
}
