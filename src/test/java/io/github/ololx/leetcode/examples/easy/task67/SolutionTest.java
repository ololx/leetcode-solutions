package io.github.ololx.leetcode.examples.easy.task67;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.03.2022 16:09
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesBinaryNumbersAndSum")
    public static Object[][] providesBinaryNumbersAndSum() {
        return new Object[][] {
                {"11", "1", "100"},
                {"1010", "1011", "10101"},
        };
    }

    @Test(dataProvider = "providesBinaryNumbersAndSum")
    public void addBinary_whenNumberIsNotNull_thenReturnSumOf(String a, String b, String sum) {
        assertEquals(new Solution().addBinary(a, b), sum);
    }
}
