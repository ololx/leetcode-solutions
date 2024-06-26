package io.github.ololx.leetcode.solutions.easy.task190;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 05.06.2022 21:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesBits")
    public static Object[][] providesBits() {
        return new Object[][] {
                {0b00000010100101000001111010011100, 0b00111001011110000010100101000000},
                {0b11111111111111111111111111111101, 0b10111111111111111111111111111111}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesBits")
    public void reverseBits_whenNumIsDefined_thenReturnReversedBits(int n , int expected) {
        assertEquals(new Solution().reverseBits(n), expected);
    }
}
