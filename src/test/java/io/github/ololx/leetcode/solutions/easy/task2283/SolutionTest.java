package io.github.ololx.leetcode.solutions.easy.task2283;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 27.12.2022 11:29
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {"1210", true},
                {"030", false}
        };
    }

    //@LogParam
    @Test(dataProvider = "providesNums")
    public void digitCount_whenNumIsCorrect_thenReturnTue(String num, boolean expected) {
        assertEquals(new Solution().digitCount(num), expected);
    }
}
