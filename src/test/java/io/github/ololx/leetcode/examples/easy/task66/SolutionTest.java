package io.github.ololx.leetcode.examples.easy.task66;

import io.github.ololx.leetcode.examples.easy.task66.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.05.2022 17:45
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesDigits")
    public static Object[][] providesDigits() {
        return new Object[][] {
                {new int[] {1, 2, 3}, new int[] {1, 2, 4}},
                {new int[] {4, 3, 2, 1}, new int[] {4, 3, 2, 2}},
                {new int[] {9}, new int[] {1, 0}},
        };
    }

    @Test(dataProvider = "providesDigits")
    public void plusOne_whenDigitsPlusOneHasCarry_thenReturnNewNumWithNewDigit(int[] digits, int[] expected) {
        assertEquals(new Solution().plusOne(digits), expected);
    }
}
