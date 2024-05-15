package io.github.ololx.leetcode.solutions.easy.task463;

import org.testng.annotations.DataProvider;

/**
 * @author Alexander A. Kropotin
 *     project leetcode-solutions
 *     created 14/05/2024 5:36pm
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "providesMaps")
    public static Object[][] providesMaps() {
        return new Object[][] {
            {
                new int[][] {
                    {0, 1, 0, 0},
                    {1, 1, 1, 0},
                    {0, 1, 0, 0},
                    {1, 1, 0, 0}
                },
                16
            },
            {
                new int[][] {{1}},
                4
            },
            {
                new int[][] {{1, 0}},
                4
            }
        };
    }
}