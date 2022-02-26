package io.github.ololx.leetcode.examples.medium.task6;

import io.github.ololx.leetcode.examples.medium.task6.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.02.2022 11:56
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class);

    @DataProvider(name = "stringsAndZigZagStrings")
    public static Object[][] stringsAndZigZagStrings() {
        return new Object[][] {
                {"PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"},
                {"PAYPALISHIRING", 4, "PINALSIGYAHRPI"},
                {"A", 1, "A"},
                {"AB", 1, "AB"}
        };
    }

    @Test(dataProvider = "stringsAndZigZagStrings")
    public void convert_whenStringIsNotNull_thenReturnZigZagString(String string, int numRows, String zigzagString) {
        log.info(
                String.format(
                        "Start test with origin string - '%s' and numRows = %d",
                        string,
                        numRows
                )
        );

        String actualZigZagString = new Solution().convert(string, numRows);
        log.info(
                String.format(
                        "Expected string is '%s' and get actual string - %s",
                        zigzagString,
                        actualZigZagString
                )
        );

        assertEquals(actualZigZagString, zigzagString);
    }
}
