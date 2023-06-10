package io.github.ololx.leetcode.solutions.easy.task2595;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 24.03.2023 09:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesN() {
        return new Object[][] {
                {17, new int[] {2, 0}},
                {2, new int[] {0, 1}}
        };
    }

    @LogParam
    @Test(dataProvider = "providesN")
    public void evenOddBit_whenNumberIsNotNull_thenReturnEvenAndOddBitCount(int n, int[] expected) {
        assertEquals(new Solution().evenOddBit(n), expected);
    }
}
