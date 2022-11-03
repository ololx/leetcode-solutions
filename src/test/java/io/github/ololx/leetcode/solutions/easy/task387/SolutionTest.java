package io.github.ololx.leetcode.solutions.easy.task387;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task387.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 31.10.2022 11:03
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesLetters")
    public static Object[][] providesLetters() {
        return new Object[][] {
                {"leetcode", 0},
                {"loveleetcode", 2},
                {"aabb", -1}
        };
    }

    @LogParam
    @Test(dataProvider = "providesLetters")
    public void firstUniqChar_ifLettersContainsUniqueLetter_thenReturnIndex(String s, int expected) {
        assertEquals(new Solution().firstUniqChar(s), expected);
    }
}