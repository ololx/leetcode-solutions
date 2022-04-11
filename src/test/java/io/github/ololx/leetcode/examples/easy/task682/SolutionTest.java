package io.github.ololx.leetcode.examples.easy.task682;

import io.github.ololx.leetcode.examples.easy.task682.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 11.04.2022 21:49
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesScoreOps")
    public static Object[][] providesScoreOps() {
        return new Object[][] {
                {new String[] {"5","2","C","D","+"}, 30},
                {new String[] {"1"}, 1}
        };
    }

    @Test(dataProvider = "providesScoreOps")
    public void calPoints_whenOpsIsNotNull_thenReturnNewScore(String[] ops, int expected) {
        assertEquals(new Solution().calPoints(ops), expected);
    }
}
