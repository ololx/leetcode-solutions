package io.github.ololx.leetcode.solutions.easy.task191;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 06.05.2022 13:58
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private final static Logger log = Logger.getLogger(SolutionTest.class.getCanonicalName());

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {0b00000000000000000000000000001011, 3},
                {0b00000000000000000000000010000000, 1},
                {0b11111111111111111111111111111101, 31},
        };
    }

    @Test(dataProvider = "providesNums")
    public void hammingWeight_whenNumHasUnits_thenReturnUnitsCount(int n , int expected) {
        int actual = new Solution().hammingWeight(n);
        log.info("Expected = " + expected + " & actual = " + actual);

        assertEquals(actual, expected);
    }
}
