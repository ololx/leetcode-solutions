package io.github.ololx.leetcode.examples.easy.task171;

import io.github.ololx.leetcode.examples.easy.task171.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 22.02.2022 20:42
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "columnsTitlesAndIndexes")
    public static Object[][] columnsTitlesAndIndexes() {
        return new Object[][] {
                {"A", 1},
                {"AB", 28},
                {"ZY", 701}
        };
    }

    @Test(dataProvider = "columnsTitlesAndIndexes")
    public void titleToNumber_whenColumnTitleIsNotEmpty_thenReturnColumnIndex(String columnTitle, int columnIntex) {
        assertEquals(new Solution().titleToNumber(columnTitle), columnIntex);
    }
}
