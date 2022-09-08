package io.github.ololx.leetcode.solutions.medium.task2090;

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
                    new int[] {40527, 53696, 10730, 66491, 62141, 83909, 78635, 18560},
                        2,
                        new int[] {-1, -1, 46717, 55393, 60381, 61947, -1, -1}
                },
                {
                    new int[] {7, 4, 3, 9, 1, 8, 5, 2, 6},
                        3,
                        new int[] {-1, -1, -1, 5, 4, 4, -1, -1, -1}
                },
                {
                        new int[] {1000},
                        0,
                        new int[] {1000}
                }
        };
    }

    @Test(dataProvider = "providesNumsAndRadius")
    public void getAverages_whenKMoreThanZero_thenReturnRadiusArray(int[] nums,
                                                                    int k,
                                                                    int[] expected) {
        assertEquals(new Solution().getAverages(nums, k), expected);
    }
}
