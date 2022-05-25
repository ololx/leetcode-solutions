package io.github.ololx.leetcode.examples.easy.task28;

import io.github.ololx.leetcode.examples.easy.task28.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 25.05.2022 12:04
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesHaystacksAndNeedles")
    public static Object[][] providesHaystacksAndNeedles() {
        return new Object[][] {
                {"mississippi", "issip", 4}
        };
    }

    @Test(dataProvider = "providesHaystacksAndNeedles")
    public void reverseString_whenCharsMoreThanOneChar_thenReverseChars(String haystack,
                                                                        String needle,
                                                                        int expected) {
        int actual = new Solution().strStr(haystack, needle);
        assertEquals(actual, expected);
    }
}
