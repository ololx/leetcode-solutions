package io.github.ololx.leetcode.examples.easy.task219;

import org.testng.annotations.DataProvider;

/**
 * project leetcode-solutions
 * created 29.06.2022 12:22
 *
 * @author Alexander A. Kropotin
 */
public class AbstractSolutionTest {

    @DataProvider(name = "providesNumsAndSubArraySize")
    public static Object[][] providesNumsAndSubArraySize() {
        return new Object[][] {
                {new int[] {1, 2, 3, 1}, 3, true},
                {new int[] {1, 0, 1, 1}, 1, true},
                {new int[] {1, 2, 3, 1, 2, 3}, 2, false}
        };
    }
}
