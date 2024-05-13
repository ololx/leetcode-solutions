package io.github.ololx.leetcode.solutions.medium.task856;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 20.03.2022 21:02
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesParentheses")
    public static Object[][] providesParentheses() {
        return new Object[][] {
                {"(())", 2},
                {"(()(()))", 6},
                {"()", 1},
                {"()()", 2}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesParentheses")
    public void scoreOfParentheses_whenStringIsNotNull_thenParenthesesCount(String s, int expected) {
        assertEquals(new Solution().scoreOfParentheses(s), expected);
    }
}
