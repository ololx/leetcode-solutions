package io.github.ololx.leetcode.solutions.easy.task461;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.07.2022 17:42
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(dataProvider = "providesXY")
    public void hammingDistance_whenXIsNotEqualsToY_thenReturnDistance(int x, int y, int expected) {
        assertEquals(new Solution().hammingDistance(x, y), expected);
    }
}
