package io.github.ololx.leetcode.solutions.easy.task1720;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import io.github.ololx.leetcode.solutions.easy.task1720.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.05.2023 11:57
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesArrays() {
        return new Object[][] {
                {new int[] {1, 2, 3}, 1, new int[] {1, 0, 2, 1}},
                {new int[] {6, 2, 7, 3}, 4, new int[] {4, 2, 0, 7, 4}},
        };
    }

    @LogParam
    @Test(dataProvider = "providesArrays")
    public void decode_whenEncodedExists_thenReturnDecoded(int[] encoded,
                                                           int first,
                                                           int[] expected) {
        assertEquals(new Solution().decode(encoded, first), expected);
    }
}
