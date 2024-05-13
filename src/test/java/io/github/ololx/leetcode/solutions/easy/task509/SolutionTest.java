package io.github.ololx.leetcode.solutions.easy.task509;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 07.07.2022 12:03
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesN")
    public void fib_whenNIsMoreThanOne_thenReturnFibonacciByN(int n,
                                                              int expected) {
        assertEquals(new Solution().fib(n), expected);
    }
}
