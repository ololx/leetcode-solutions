package io.github.ololx.leetcode.solutions.easy.task2169;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.05.2022 18:47
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNum1AndNum2")
    public static Object[][] providesNum1AndNum2() {
        return new Object[][] {
                {2, 3, 3},
                {10, 10, 1}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNum1AndNum2")
    public void countOperations_whenNum1IsNotEqualNum2_thenReturnMoreOneCount(int num1,
                                                                              int num2,
                                                                              int expected) {
        assertEquals(new Solution().countOperations(num1, num2), expected);
    }
}
