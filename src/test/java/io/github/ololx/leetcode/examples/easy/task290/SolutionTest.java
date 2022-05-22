package io.github.ololx.leetcode.examples.easy.task290;

import io.github.ololx.leetcode.examples.easy.task290.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 22.05.2022 17:59
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesPatternsAndStrings")
    public static Object[][] providesPatternsAndStrings() {
        return new Object[][] {
                {"abba", "dog dog dog dog", false},
                {"aaa", "aa aa aa aa", false},
                {"abba", "dog cat cat dog", true},
                {"abba", "dog cat cat fish", false},
                {"aaaa", "dog cat cat fish", false}
        };
    }

    @Test(dataProvider = "providesPatternsAndStrings")
    public void wordPattern_whenStringIsPatterned_thenReturntrue(String pattern, String s, boolean expected) {
        assertEquals(new Solution().wordPattern(pattern, s), expected);
    }
}
