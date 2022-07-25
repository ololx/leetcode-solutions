package io.github.ololx.leetcode.examples.easy.task461;

import org.testng.annotations.DataProvider;

/**
 * project leetcode-solutions
 * created 09.07.2022 17:42
 *
 * @author Alexander A. Kropotin
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "providesXY")
    public static Object[][] providesXY() {
        return new Object[][] {
                {1, 4, 2},
                {3, 1, 1}
        };
    }
}
