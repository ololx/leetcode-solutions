package io.github.ololx.leetcode.solutions.easy.task169;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 12.09.2022 12:49
 *
 * @author Alexander A. Kropotin
 */
public class AbstractSolutionTest {

    @DataProvider(name = "providesNums")
    public static Object[][] providesNums() {
        return new Object[][] {
                {new int[] {3, 2, 3}, 3},
                {new int[] {2, 2, 1, 1, 1, 2, 2}, 2},
        };
    }
}
