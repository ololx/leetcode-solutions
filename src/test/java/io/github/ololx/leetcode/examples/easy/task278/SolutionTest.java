package io.github.ololx.leetcode.examples.easy.task278;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.02.2022 17:52
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "versionsCountAndBadVersionNumber")
    public static Object[][] versionsCountAndBadVersionNumber() {
        return new Object[][] {
                {5, 4},
                {1, 1}
        };
    }

    @Test(dataProvider = "versionsCountAndBadVersionNumber")
    public void firstBadVersion_whenBadVersionExists_thenReturnVersionNumber(int n , int bad) {
        assertEquals(new Solution(bad).firstBadVersion(n), bad);
    }
}
