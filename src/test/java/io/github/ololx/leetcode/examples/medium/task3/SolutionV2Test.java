package io.github.ololx.leetcode.examples.medium.task3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 07.02.2022 16:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test extends AbstractSolutionTest {

    @Test(dataProvider = "stringsAndSubstrings")
    public void lengthOfLongestSubstring_returnSubstringLength(String string, String substring) {
        assertEquals(new SolutionV2().lengthOfLongestSubstring(string), substring.length());
    }
}
