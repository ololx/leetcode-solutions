package io.github.ololx.leetcode.solutions.easy.task338;

import org.testng.annotations.DataProvider;

/**
 * project leetcode-solutions
 * created 10.07.2022 15:27
 *
 * @author Alexander A. Kropotin
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {2, new int[] {0, 1, 1}},
                {5, new int[] {0, 1, 1, 2, 1, 2}},
                {129, new int[] {
                        0, 1, 1, 2, 1, 2, 2,
                        3, 1, 2, 2, 3, 2, 3,
                        3, 4, 1, 2, 2, 3, 2,
                        3, 3, 4, 2, 3, 3, 4,
                        3, 4, 4, 5, 1, 2, 2,
                        3, 2, 3, 3, 4, 2, 3,
                        3, 4, 3, 4, 4, 5, 2,
                        3, 3, 4, 3, 4, 4, 5,
                        3, 4, 4, 5, 4, 5, 5,
                        6, 1, 2, 2, 3, 2, 3,
                        3, 4, 2, 3, 3, 4, 3,
                        4, 4, 5, 2, 3, 3, 4,
                        3 ,4, 4, 5, 3, 4, 4,
                        5, 4, 5, 5, 6, 2, 3,
                        3, 4, 3, 4, 4, 5, 3,
                        4, 4, 5, 4, 5, 5, 6,
                        3, 4, 4, 5, 4, 5, 5,
                        6, 4, 5, 5, 6, 5, 6,
                        6, 7, 1, 2
                }}
        };
    }
}
