package io.github.ololx.leetcode.solutions.easy.task557;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 01.06.2022 14:08
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(dataProvider = "providesStrings")
    public void reverseWords_whenSContainsWords_thenReturnReversedEachWorkInS(String s,
                                                                              String expected) {
        assertEquals(new Solution().reverseWords(s), expected);
    }
}
