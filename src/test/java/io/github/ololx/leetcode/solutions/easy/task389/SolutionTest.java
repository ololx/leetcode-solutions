package io.github.ololx.leetcode.solutions.easy.task389;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 06.05.2022 09:56
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private final static Logger log = Logger.getLogger(SolutionTest.class.getCanonicalName());

    @DataProvider(name = "providesSAndT")
    public static Object[][] providesSAndT() {
        return new Object[][] {
                {"a", "aa", 'a'},
                {"a", "ae", 'e'},
                {"abcd", "abcde", 'e'},
                {"", "y", 'y'}
        };
    }

    @Test(dataProvider = "providesSAndT")
    public void findTheDifference_whenStringIsDifferent_thenReturnDifference(String s , String t, char expected) {
        char actual = new Solution().findTheDifference(s, t);
        log.info("Expected = " + expected + " & actual = " + actual);

        assertEquals(actual, expected);
    }
}
