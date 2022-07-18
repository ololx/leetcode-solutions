package io.github.ololx.leetcode.examples.easy.task461;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 18.07.2022 15:16
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV3Test extends AbstractSolutionTest {

    @Test(dataProvider = "providesXY")
    public void hammingDistance_whenXIsNotEqualsToY_thenReturnDistance(int x, int y, int expected) {
        assertEquals(new SolutionV3().hammingDistance(x, y), expected);
    }
}
