package io.github.ololx.leetcode.examples.easy.task258;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 16.05.2022 11:25
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {38, 2},
                {0, 0}
        };
    }

    @Test(dataProvider = "providesNums")
    public void addDigits_whenNumHigherZero_thenReturnDigitalRoot(int n, int expected) {
        assertEquals(new Solution().addDigits(n), expected);
    }
}
