package io.github.ololx.leetcode.solutions.easy.task125;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 26.10.2022 11:45
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"A man, a plan, a canal: Panama", true},
                {"race a car", false},
                {" ", true}
        };
    }

    @LogParam
    @Test(dataProvider = "providesStrings")
    public void isPalindrome_whenSIsPalindrome_thenReturnTrue(String haystack, boolean expected) {
        boolean actual = new Solution().isPalindrome(haystack);
        assertEquals(actual, expected);
    }
}
