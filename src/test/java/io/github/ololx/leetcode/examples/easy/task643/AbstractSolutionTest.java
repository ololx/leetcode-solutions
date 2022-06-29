package io.github.ololx.leetcode.examples.easy.task643;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 29.06.2022 14:33
 *
 * @author Alexander A. Kropotin
 */
public class AbstractSolutionTest {

    @DataProvider(name = "providesNumsAndSubArraySize")
    public static Object[][] providesNumsAndSubArraySize() {
        return new Object[][] {
                {new int[] {1, 12, -5, -6, 50, 3}, 4, 12.75d},
                {new int[] {0, 4, 0, 3, 2}, 1, 4d},
                {new int[] {5}, 1, 5d}
        };
    }
}
