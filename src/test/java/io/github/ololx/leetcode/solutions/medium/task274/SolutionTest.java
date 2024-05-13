package io.github.ololx.leetcode.solutions.medium.task274;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 07/10/2023 5:07 pm
 */
public class SolutionTest {

    @DataProvider
    public static Object[][] providesCitations() {
        return new Object[][]{
            {new int[]{3, 0, 6, 1, 5}, 3},
            {new int[]{1, 3, 1}, 1},
        };
    }

    @LogParam
    @Test(timeOut = 3000L, dataProvider = "providesCitations")
    public void hIndex_whnCitationsMoreOrEqualsPublications_thenReturnCitations(int[] citations, int expected) {
        assertEquals(new Solution().hIndex(citations), expected);
    }
}
