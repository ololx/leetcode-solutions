package io.github.ololx.leetcode.solutions.easy.task541;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 30.05.2022 22:06
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"abcdef", 3,"cbadef"},
                {"a", 2, "a"},
                {"abcdefg", 2, "bacdfeg"},
                {"abcd", 2, "bacd"}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void reverseStr_whenKisLessThenLength_thenReturnReversedKSymbols(String s,
                                                                            int k,
                                                                            String expected) {
        assertEquals(new Solution().reverseStr(s, k), expected);
    }
}
