package io.github.ololx.leetcode.solutions.easy.task1592;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.10.2022 15:09
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"  this   is  a sentence ", "this   is   a   sentence"},
                {"a", "a"},
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void reorderSpaces_whenStringIsNotNull_thenReorderSpaces(String s, String expected) {
        assertEquals(new Solution().reorderSpaces(s), expected);
    }
}
