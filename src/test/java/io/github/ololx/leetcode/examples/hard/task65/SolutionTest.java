package io.github.ololx.leetcode.examples.hard.task65;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.02.2022 16:38
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "numbersAndResultOfValidation")
    public static Object[][] numbersAndResultOfValidation() {
        return new Object[][] {
                {"2", true},
                {"0089", true},
                {"-0.1", true},
                {"+3.14", true},
                {"4.", true},
                {"-.9", true},
                {"2e10", true},
                {"-90E3", true},
                {"3e+7", true},
                {"6e-1", true},
                {"53.5e93", true},
                {"-123.456e789", true},
                {"abc", false},
                {"1a", false},
                {"1e", false},
                {"e3", false},
                {"99e2.5", false},
                {"--6", false},
                {"-+3", false},
                {"95a54e53", false}
        };
    }

    @Test(dataProvider = "numbersAndResultOfValidation")
    public void isNumber_whenStringISValidNumber_thenReturnTrue(String s, boolean result) {
        System.out.println("S = " + s + "   result = " + result);
        assertEquals(new Solution().isNumber(s), result);
    }
}
