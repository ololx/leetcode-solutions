package io.github.ololx.leetcode.examples.medium.task71;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.03.2022 21:41
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesPaths")
    public static Object[][] providesPaths() {
        return new Object[][] {
                {"/home/", "/home"},
                {"/../", "/"},
                {"/home//foo/", "/home/foo"}
        };
    }

    @Test(dataProvider = "providesPaths")
    public void simplifyPath_whenPathsIsNotNull_thenReturnCanonicalPath(String path,
                                                                        String expected) {
        log.info("Start test with path - " + path);

        String actual = new Solution().simplifyPath(path);
        log.info("Expected - " + expected + ", actual - " + actual);

        assertEquals(actual, expected);
    }
}
