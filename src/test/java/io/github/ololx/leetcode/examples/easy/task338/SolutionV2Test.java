package io.github.ololx.leetcode.examples.easy.task338;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 10.07.2022 15:27
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test extends AbstractSolutionTest {

    @Test(dataProvider = "providesN")
    public void countBits_whenNIsNotZero_thenReturnCountOfOneBitsMoreThanOne(int n,
                                                                             int[] expected) {
        assertEquals(new SolutionV2().countBits(n), expected);
    }
}
