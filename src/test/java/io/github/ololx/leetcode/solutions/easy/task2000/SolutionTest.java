package io.github.ololx.leetcode.solutions.easy.task2000;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.07.2022 19:44
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"abcdefd", 'd', "dcbaefd"},
                {"xyxzxe", 'z', "zxyxxe"},
                {"abcd", 'z', "abcd"},
        };
    }

    @Test(dataProvider = "providesStrings")
    public void reversePrefix_whenWordAndChIsNotEmpty_thenReverseWord(String word ,
                                                                      char ch,
                                                                      String expected) {
        assertEquals(new Solution().reversePrefix(word, ch), expected);
    }
}
