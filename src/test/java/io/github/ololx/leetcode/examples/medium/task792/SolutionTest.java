package io.github.ololx.leetcode.examples.medium.task792;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 24.06.2022 20:05
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStringAndWords")
    public static Object[][] providesStringAndWords() {
        return new Object[][] {
                {"abcde", new String[] {"a", "bb", "acd", "ace"}, 3},
                {"dsahjpjauf", new String[] {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"}, 2}
        };
    }

    @Test(dataProvider = "providesStringAndWords")
    public void numMatchingSubseq_whenWordsContainsSubstrings_thenReturnCount(String s,
                                                                              String[] words,
                                                                              int expected) {
        assertEquals(new Solution().numMatchingSubseq(s, words), expected);
    }
}
