package io.github.ololx.leetcode.solutions.medium.task2486;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 28/11/2022 20:29
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesSAndT")
    public static Object[][] providesSAndT() {
        return new Object[][] {
                {"coaching", "coding", 4},
                {"abcde", "a", 0},
                {"z", "abcde", 5}
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesSAndT")
    public void appendCharacters_whenTCanBeSubOfS_thenReturnCountOfAdditionalSymbols(String s,
                                                                                     String t,
                                                                                     int expected) {
        assertEquals(new Solution().appendCharacters(s, t), expected);
    }
}
