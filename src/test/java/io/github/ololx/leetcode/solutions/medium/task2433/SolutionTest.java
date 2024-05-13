package io.github.ololx.leetcode.solutions.medium.task2433;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 14.05.2023 12:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesArrays() {
        return new Object[][] {
                {new int[] {5, 2, 0, 3, 1}, new int[] {5, 7, 2, 3, 2}},
                {new int[] {13}, new int[] {13}},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesArrays")
    public void findArray_whenPrefContainsElements_thenReturnOriginArray(int[] encoded,
                                                                         int[] expected) {
        assertEquals(new Solution().findArray(encoded), expected);
    }
}
