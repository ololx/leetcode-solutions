package io.github.ololx.leetcode.solutions.easy.task2124;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.02.2022 17:03
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "sentencesAndResult")
    public static Object[][] sentencesAndResult() {
        return new Object[][] {
                {"aaabbb", true},
                {"abab", false},
                {"bbb", true}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "sentencesAndResult")
    public void checkString_whenAAppearsBeforeEveryB_thenReturnTrue(String sentence , boolean result) {
        assertEquals(new Solution().checkString(sentence), result);
    }
}
