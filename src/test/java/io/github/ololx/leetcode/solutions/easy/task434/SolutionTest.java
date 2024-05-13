package io.github.ololx.leetcode.solutions.easy.task434;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.11.2022 21:17
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"Hello, my name is John", 5},
                {"Hello", 1},
                {"             ", 0}
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void countSegments_whenStringHasWords_thenReturnCount(String s, int expected) {
        assertEquals(new Solution().countSegments(s), expected);
    }
}
