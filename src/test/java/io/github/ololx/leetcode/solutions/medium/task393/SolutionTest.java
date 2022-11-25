package io.github.ololx.leetcode.solutions.medium.task393;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.medium.task393.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 25/11/2022 22:13
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesUTF8Data")
    public static Object[][] providesUTF8Data() {
        return new Object[][] {
                {new int[] {197, 130, 1}, true},
                {new int[] {235, 140, 4}, false}
        };
    }

    @LogParam
    @Test(dataProvider = "providesUTF8Data")
    public void validUtf8s_whenValid_thenReturnTrue(int[] data, boolean expected) {
        assertEquals(new Solution().validUtf8(data), expected);
    }
}
