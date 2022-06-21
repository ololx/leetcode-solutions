package io.github.ololx.leetcode.examples.easy.task88;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.06.2022 19:40
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumArrays")
    public static Object[][] providesNumArrays() {
        return new Object[][] {
                {
                    new int[] {1, 2, 3, 0, 0, 0},
                        new int[] {2, 5, 6},
                        new int[] {1, 2, 2, 3, 5, 6}
                },
                {
                        new int[] {1},
                        new int[0],
                        new int[] {1}
                },
                {
                        new int[] {0},
                        new int[] {1},
                        new int[] {1}
                },
        };
    }

    @Test(dataProvider = "providesNumArrays")
    public void merge_whenArraysIsNotEmpty_thenMerge(int[] nums1, int[] nums2, int[] expected) {
        new Solution().merge(nums1, nums1.length - nums2.length, nums2, nums2.length);

        assertEquals(expected, nums1);
    }
}
