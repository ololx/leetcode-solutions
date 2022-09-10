package io.github.ololx.leetcode.solutions.easy.task2108;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 31.07.2022 19:36
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesWords")
    public static Object[][] providesWords() {
        return new Object[][] {
                {new String[] {"abc", "car", "ada", "racecar", "cool"}, "ada"},
                {new String[] {"notapalindrome", "racecar"}, "racecar"},
                {new String[] {"def","ghi"}, ""}
        };
    }

    @Test(dataProvider = "providesWords")
    public void firstPalindrome_whenWordsContainsPalindrome_thenIt(String[] words ,
                                                                   String expected) {
        assertEquals(new Solution().firstPalindrome(words), expected);
    }
}
