package io.github.ololx.leetcode.solutions.easy.task3090;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 20/05/2024 8:00pm
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesStrings() {
        return new Object[][]{
            {"bcbbbcba", 4},
            {"aaaa", 2},
            {"", 0},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void maximumLengthSubstring_whenStringNotEmpty_thenCountMoreZero(String s, int expected) {
        assertEquals(new Solution().maximumLengthSubstring(s), expected);
    }
}