package io.github.ololx.leetcode.solutions.easy.task1356;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.07.2022 19:33
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesArraysWitDigits")
    public static Object[][] providesArraysWitDigits() {
        return new Object[][] {
                {
                    new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8},
                        new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7}
                },
                {
                    new int[] {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1},
                        new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}
                }
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesArraysWitDigits")
    public void sortByBits_whenArrayIsNotEmpty_thenReturnSortedArrayByBitCounts(int[] digits ,
                                                                                int[] expected) {
        assertEquals(new Solution().sortByBits(digits), expected);
    }
}
