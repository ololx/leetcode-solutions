package io.github.ololx.leetcode.solutions.easy.task2138;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 07.10.2022 00:57
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStringsKAndFill")
    public static Object[][] providesStringsKAndFill() {
        return new Object[][] {
                {"abcdefghi", 3, 'x', new String[] {"abc", "def", "ghi"}}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStringsKAndFill")
    public void divideString_whenStringIsNotEmpty_thenDivideString(String s,
                                                                   int k,
                                                                   char fill,
                                                                   String[] expected) {
        assertEquals(new Solution().divideString(s, k, fill), expected);
    }
}
