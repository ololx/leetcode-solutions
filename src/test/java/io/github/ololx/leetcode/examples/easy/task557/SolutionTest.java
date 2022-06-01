package io.github.ololx.leetcode.examples.easy.task557;

import io.github.ololx.leetcode.examples.easy.task557.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 01.06.2022 14:08
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"},
                {"God Ding", "doG gniD"}
        };
    }

    @Test(dataProvider = "providesStrings")
    public void reverseWords_whenSContainsWords_thenReturnReversedEachWorkInS(String s,
                                                                              String expected) {
        assertEquals(new Solution().reverseWords(s), expected);
    }
}
