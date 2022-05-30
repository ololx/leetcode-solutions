package io.github.ololx.leetcode.examples.easy.task541;

import io.github.ololx.leetcode.examples.easy.task541.Solution;
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
                {"abcdefg", 2, "bacdfeg"},
                {"abcdefg", 2, "bacdfeg"},
        };
    }

    @Test(dataProvider = "providesStrings")
    public void reverseStr_whenKisLessThenLength_thenReturnReversedKSymbols(String s,
                                                                            int k,
                                                                            String expected) {
        assertEquals(new Solution().reverseStr(s, k), expected);
    }
}
