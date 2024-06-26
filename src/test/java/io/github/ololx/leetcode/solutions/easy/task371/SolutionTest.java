package io.github.ololx.leetcode.solutions.easy.task371;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.03.2022 13:43
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumbers")
    public static Object[][] providesNumbers() {
        return new Object[][] {
                {1, 2, 3},
                {2, 3, 5}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNumbers")
    public void getSum_whenNumberIsInInteger_thenReturnSumOf(int a, int b, int sum) {
        assertEquals(new Solution().getSum(a, b), sum);
    }
}
