package io.github.ololx.leetcode.solutions.easy.task231;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 06.05.2022 14:18
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private final static Logger log = Logger.getLogger(SolutionTest.class.getCanonicalName());

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {1, true},
                {16, true},
                {3, false},
                {-2147483648, false},
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesNums")
    public void isPowerOfTwo_whenNumIsPowerOf2_thenReturnTrue(int n , boolean expected) {
        boolean actual = new Solution().isPowerOfTwo(n);
        log.info("Expected = " + expected + " & actual = " + actual);

        assertEquals(actual, expected);
    }
}
