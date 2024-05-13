package io.github.ololx.leetcode.solutions.easy.task14;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 17.02.2022 13:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "stringsAndPrefix")
    public static Object[][] stringsAndPrefix() {
        return new Object[][] {
                {new String[] {"flower","flow","flight"}, "fl"},
                {new String[] {"dog","racecar","car"}, ""}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "stringsAndPrefix")
    public void romanToInt_whenRomanNumberIsDefine_thenReturnNonZeroIntegerNumber(String[] strs , String prefix) {
        assertEquals(new Solution().longestCommonPrefix(strs), prefix);
    }
}
