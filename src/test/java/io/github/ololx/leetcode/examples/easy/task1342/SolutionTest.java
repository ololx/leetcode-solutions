package io.github.ololx.leetcode.examples.easy.task1342;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.05.2022 09:58
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {14, 6},
                {8, 4},
                {123, 12}
        };
    }

    @Test(dataProvider = "providesNums")
    public void numberOfSteps_whenNumIsMoreThenZero_thenReturnNumberOfStepsToReduce(int num,
                                                                                    int expected) {
        assertEquals(new Solution().numberOfSteps(num), expected);
    }
}
