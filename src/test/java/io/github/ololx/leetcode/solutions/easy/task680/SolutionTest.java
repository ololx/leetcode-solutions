package io.github.ololx.leetcode.solutions.easy.task680;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 28.10.2022 13:31
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"aba", true},
                {"abca", true},
                {"abc", false}
        };
    }

    @LogParam
    @Test(dataProvider = "providesStrings")
    public void divideString_whenStringIsNotEmpty_thenDivideString(String s, boolean expected) {
        assertEquals(new Solution().validPalindrome(s), expected);
    }
}
