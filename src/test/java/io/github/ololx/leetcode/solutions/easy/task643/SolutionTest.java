package io.github.ololx.leetcode.solutions.easy.task643;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.06.2022 14:33
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(dataProvider = "providesNumsAndSubArraySize")
    public void findMaxAverage_whenNumsIsMoreThanOne_thenReturnMaxAVG(int[] nums,
                                                                      int k,
                                                                      double expected) {
        assertEquals(new Solution().findMaxAverage(nums, k), expected);
    }
}
