package io.github.ololx.leetcode.examples.medium.task12;

import io.github.ololx.leetcode.examples.medium.task12.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 11.02.2022 19:14
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "integerAndRomanNumbers")
    public static Object[][] integerAndRomanNumbers() {
        return new Object[][] {
                {3, "III"},
                {58, "LVIII"},
                {33, "XXXIII"},
                {1994, "MCMXCIV"},
                {888, "DCCCLXXXVIII"}
        };
    }

    @Test(dataProvider = "integerAndRomanNumbers")
    public void intToRoman_whenIntegerIsDefine_thenReturnNonZeroRomanNumber(int integer, String roman) {
        assertEquals(new Solution().intToRoman(integer), roman);
    }
}
