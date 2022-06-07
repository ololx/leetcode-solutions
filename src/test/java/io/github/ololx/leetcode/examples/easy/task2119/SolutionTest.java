package io.github.ololx.leetcode.examples.easy.task2119;

import io.github.ololx.leetcode.examples.easy.task2119.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 07.06.2022 13:12
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {526, true},
                {1800, false},
                {0, true}
        };
    }

    @Test(dataProvider = "providesNums")
    public void isSameAfterReversals_whenNumIsDoubleReversal_thenReturnTrue(int num,
                                                                            boolean expected) {
        assertEquals(new Solution().isSameAfterReversals(num), expected);
    }
}
