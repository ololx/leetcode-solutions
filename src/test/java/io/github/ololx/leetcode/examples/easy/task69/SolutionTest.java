package io.github.ololx.leetcode.examples.easy.task69;

import io.github.ololx.leetcode.examples.easy.task69.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.05.2022 15:54
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {4, 2},
                {9, 3},
                {8, 2},
                {10, 3}
        };
    }

    @Test(dataProvider = "providesNums")
    public void mySqrt_whenXMoreThanOne_thenReturnSQRTRounded(int x, int expected) {
        assertEquals(new Solution().mySqrt(x), expected);
    }
}
