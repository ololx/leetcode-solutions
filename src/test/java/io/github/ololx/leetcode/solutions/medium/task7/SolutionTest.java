package io.github.ololx.leetcode.solutions.medium.task7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 08.02.2022 21:15
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "numbers")
    public static Object[][] numbers() {
        return new Object[][] {
                {-2147483648, 0},
                {121, 121},
                {123, 321},
                {-121, -121},
                {-123, -321},
                {120, 21},
                {1, 1},
                {0, 0},
                {1534236469, 0}
        };
    }

    @Test(dataProvider = "numbers")
    public void reverse_whenNumberIsNot0_thenReturnReversedNumber(int number, int reversedNumber) {
        assertEquals(
                new Solution().reverse(number),
                reversedNumber
        );
    }
}
