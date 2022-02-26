package io.github.ololx.leetcode.examples.medium.task6;

import io.github.ololx.leetcode.examples.medium.task6.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.02.2022 11:56
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "stringsAndZigZagStrings")
    public static Object[][] stringsAndZigZagStrings() {
        return new Object[][] {
                {"PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"},
                {"PAYPALISHIRING", 4, "PINALSIGYAHRPI"},
        };
    }

    @Test(dataProvider = "stringsAndZigZagStrings")
    public void convert_whenStringIsNotNull_thenReturnZigZagString(String string, int numRows, String zigzagString) {
        System.out.println(string);
        System.out.println(new Solution().convert(string, numRows));

        //assertEquals(zigzagString.length(), new io.github.ololx.leetcode.examples.medium.task3.Solution().lengthOfLongestSubstring(string));
    }
}
