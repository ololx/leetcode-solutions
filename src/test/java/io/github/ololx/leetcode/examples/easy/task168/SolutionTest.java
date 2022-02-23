package io.github.ololx.leetcode.examples.easy.task168;

import io.github.ololx.leetcode.examples.easy.task168.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23.02.2022 12:55
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "columnsNumbersAndTitles")
    public static Object[][] columnsNumbersAndTitles() {
        return new Object[][] {
                {1, "A"},
                {28, "AB"},
                {701, "ZY"}
        };
    }

    @Test(dataProvider = "columnsNumbersAndTitles")
    public void convertToTitle_whenColumNumberIsMoreThanZero_thenReturnNonEmptyColumnTitle(int columnNumber, String columnTitle) {
        assertEquals(new Solution().convertToTitle(columnNumber), columnTitle);
    }
}
