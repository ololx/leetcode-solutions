package io.github.ololx.leetcode.solutions.easy.task342;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.05.2022 17:39
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {16, true},
                {5, false},
                {1, true}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNums")
    public void isPowerOfFour_whenNisPowerOfFour_thenReturnTrue(int n, boolean expected) {
        assertEquals(new Solution().isPowerOfFour(n), expected);
    }
}
