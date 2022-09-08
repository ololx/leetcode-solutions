package io.github.ololx.leetcode.solutions.easy.task1009;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.05.2022 20:57
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {5, 2},
                {1, 0}
        };
    }

    @Test(dataProvider = "providesN")
    public void bitwiseComplement_whenNHasComplementMoreThenZero_thenReturnNonZeroN(int n, int expected) {
        assertEquals(new Solution().bitwiseComplement(n), expected);
    }
}
