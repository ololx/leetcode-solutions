package io.github.ololx.leetcode.examples.medium.task8;

import io.github.ololx.leetcode.examples.medium.task8.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.02.2022 21:03
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "atoiStringsAndIntegers")
    public static Object[][] atoiStringsAndIntegers() {
        return new Object[][] {
                {"42", 42},
                {"-42", -42},
                {"4193 with words", 4193},
                {"-91283472332", -2147483648}
        };
    }

    @Test(dataProvider = "atoiStringsAndIntegers")
    public void myAtoi_whenStringIsNotEmpty_thenReturnNonZeroInteger(String s , int integer) {
        assertEquals(new Solution().myAtoi(s), integer);
    }
}
