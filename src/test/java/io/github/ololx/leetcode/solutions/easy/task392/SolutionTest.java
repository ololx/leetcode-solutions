package io.github.ololx.leetcode.solutions.easy.task392;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 23.06.2022 22:59
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesStrings")
    public static Object[][] providesStrings() {
        return new Object[][] {
                {"abc", "ahbgdc", true},
                {"axc", "ahbgdc", false}
        };
    }

    @Test(dataProvider = "providesStrings")
    public void rotateRight_whenHeadNodeHasNext_thenReturnRotatedList(String s,
                                                                      String t,
                                                                      boolean expected) {
        assertEquals(new Solution().isSubsequence(s, t), expected);
    }
}
