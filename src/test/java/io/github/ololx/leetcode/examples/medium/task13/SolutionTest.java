package io.github.ololx.leetcode.examples.medium.task13;

import io.github.ololx.leetcode.examples.medium.task13.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 11.02.2022 13:21
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "romanAndIntegerNumbers")
    public static Object[][] romanAndIntegerNumbers() {
        return new Object[][] {
                {"III", 3},
                {"LVIII", 58},
                {"MCMXCIV", 1994},
        };
    }

    @Test(dataProvider = "romanAndIntegerNumbers")
    public void romanToInt_whenRomanNumberIsDefine_thenReturnNonZeroIntegerNumber(String roman , int integer) {
        assertEquals(new Solution().romanToInt(roman), integer);
    }
}
