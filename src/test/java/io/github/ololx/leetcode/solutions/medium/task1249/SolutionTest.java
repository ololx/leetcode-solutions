package io.github.ololx.leetcode.solutions.medium.task1249;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 16.03.2022 22:04
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesString")
    public static Object[][] providesString() {
        return new Object[][] {
                {"lee(t(c)o)de)", "lee(t(c)o)de"},
                {"a)b(c)d", "ab(c)d"},
                {"))((", ""},
        };
    }

    @Test(dataProvider = "providesString")
    public void minRemoveToMakeValid_whenStringIsNotNull_thenReturnRightString(String s, String expected) {
        assertEquals(new Solution().minRemoveToMakeValid(s), expected);
    }
}
