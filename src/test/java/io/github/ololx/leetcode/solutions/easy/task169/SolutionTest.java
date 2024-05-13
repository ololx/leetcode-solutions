package io.github.ololx.leetcode.solutions.easy.task169;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.09.2022 12:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(timeOut = 3000L, dataProvider = "providesNums")
    public void majorityElement_whenNumsIsNotEmpty_thenReturnMajorityNum(int[] nums, int expected) {
        assertEquals(new Solution().majorityElement(nums), expected);
    }
}
