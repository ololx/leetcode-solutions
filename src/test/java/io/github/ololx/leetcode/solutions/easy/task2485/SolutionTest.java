package io.github.ololx.leetcode.solutions.easy.task2485;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 30/11/2022 09:20
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {8, 6},
                {1, 1},
                {4, -1}
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesN")
    public void pivotInteger_whenPivotIntegerExists_thenReturnIt(int n, int expected) {
        assertEquals(new Solution().pivotInteger(n), expected);
    }
}
