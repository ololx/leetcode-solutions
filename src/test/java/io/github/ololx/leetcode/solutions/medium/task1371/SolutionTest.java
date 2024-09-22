package io.github.ololx.leetcode.solutions.medium.task1371;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 18/09/2024 12:13pm
 */
public class SolutionTest {

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][]{
            {"eleetminicoworoep", 13},
            {"leetcodeisgreat", 5},
            {"bcbcbc", 6},
        };
    }

    @LogParam
    @Test(
        timeOut = 3000L,
        dataProvider = "providesStrings"
    )
    public void testFindTheLongestSubstring(String string, int expected) {
        assertEquals(new Solution().findTheLongestSubstring(string), expected);
    }
}
