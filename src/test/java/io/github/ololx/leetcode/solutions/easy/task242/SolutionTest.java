package io.github.ololx.leetcode.solutions.easy.task242;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 21.06.2022 21:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"anagram", "nagaram", true},
                {"rat", "car", false}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesStrings")
    public void isAnagram_whenSAndTAreAnagram_thenReturnTrue(String s,
                                                                String t,
                                                                boolean expected) {
        assertTrue(new Solution().isAnagram(s, t) == expected);
    }
}
