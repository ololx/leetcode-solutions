package io.github.ololx.leetcode.examples.easy.task338;

import io.github.ololx.leetcode.examples.easy.task338.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.07.2022 15:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {2, new int[] {0, 1, 1}},
                {5, new int[] {0, 1, 1, 2, 1, 2}}
        };
    }

    @Test(dataProvider = "providesN")
    public void countBits_whenNIsNotZero_thenReturnCountOfOneBitsMoreThanOne(int n,
                                                                             int[] expected) {
        assertEquals(new Solution().countBits(n), expected);
    }
}
