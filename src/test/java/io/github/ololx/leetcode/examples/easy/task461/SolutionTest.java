package io.github.ololx.leetcode.examples.easy.task461;

import io.github.ololx.leetcode.examples.easy.task461.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.07.2022 17:42
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesXY")
    public static Object[][] providesXY() {
        return new Object[][] {
                {1, 4, 2},
                {3, 1, 1}
        };
    }

    @Test(dataProvider = "providesXY")
    public void hammingDistance_whenXIsNotEqualsToY_thenReturnDistance(int x, int y, int expected) {
        assertEquals(new Solution().hammingDistance(x, y), expected);
    }
}
