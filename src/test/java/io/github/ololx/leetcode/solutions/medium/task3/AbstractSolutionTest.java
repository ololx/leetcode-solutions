package io.github.ololx.leetcode.solutions.medium.task3;

import org.testng.annotations.DataProvider;

/**
 * project leetcode-solutions
 * created 07.02.2022 16:28
 *
 * @author Alexander A. Kropotin
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "stringsAndSubstrings")
    public static Object[][] stringsAndSubstrings() {
        return new Object[][] {
                {"",""},
                {"a","a"},
                {"abcabcbb","abc"},
                {"bbbbb","b"},
                {"pwwkew","wke"},
        };
    }
}
