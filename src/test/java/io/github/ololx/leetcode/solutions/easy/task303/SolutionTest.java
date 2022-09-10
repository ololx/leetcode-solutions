package io.github.ololx.leetcode.solutions.easy.task303;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 03.06.2022 23:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @Test
    public void sumRange_whenRangeIsNotEmpty_thenReturnSumOfRangeHigherThanZero() {
        Solution.NumArray numArray = new Solution.NumArray(new int[] {-2, 0, 3, -5, 2, -1});

        assertEquals(numArray.sumRange(0, 2), 1);
        assertEquals(numArray.sumRange(2, 5), -1);
        assertEquals(numArray.sumRange(0, 5), -3);
    }
}
