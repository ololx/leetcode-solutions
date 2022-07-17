package io.github.ololx.leetcode.examples.easy.task219;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.06.2022 12:22
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(dataProvider = "providesNumsAndSubArraySize")
    public void containsNearbyDuplicate_whenNumsContainsDuplicates_thenReturnTrue(int[] nums,
                                                                                  int k,
                                                                                  boolean expected) {
        assertEquals(new Solution().containsNearbyDuplicate(nums, k), expected);
    }
}
