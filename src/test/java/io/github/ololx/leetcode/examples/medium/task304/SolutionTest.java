package io.github.ololx.leetcode.examples.medium.task304;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * project leetcode-solutions
 * created 17.06.2022 15:23
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesNumsArraysAndSquares")
    public static Object[][] providesNumsArraysAndSquares() {
        return new Object[][] {
                {
                    new int[][] {
                            {3, 0, 1, 4, 2},
                            {5, 6, 3, 2, 1},
                            {1, 2, 0, 1, 5},
                            {4, 1, 0, 1, 7},
                            {1, 0, 3, 0, 5}
                    },
                        0,
                        0,
                        1,
                        1,
                        14
                },
                {
                        new int[][] {
                                {3, 0, 1, 4, 2},
                                {5, 6, 3, 2, 1},
                                {1, 2, 0, 1, 5},
                                {4, 1, 0, 1, 7},
                                {1, 0, 3, 0, 5}
                        },
                        2,
                        1,
                        4,
                        3,
                        8
                },
                {
                        new int[][] {
                                {3, 0, 1, 4, 2},
                                {5, 6, 3, 2, 1},
                                {1, 2, 0, 1, 5},
                                {4, 1, 0, 1, 7},
                                {1, 0, 3, 0, 5}
                        },
                        1,
                        1,
                        2,
                        2,
                        11
                },
                {
                        new int[][] {
                                {3, 0, 1, 4, 2},
                                {5, 6, 3, 2, 1},
                                {1, 2, 0, 1, 5},
                                {4, 1, 0, 1, 7},
                                {1, 0, 3, 0, 5}
                        },
                        1,
                        2,
                        2,
                        4,
                        12
                }
        };
    }

    @Test(dataProvider = "providesNumsArraysAndSquares")
    public void findDuplicate_whenDuplicateInNums_thenReturnNum(int[][] matrix,
                                                                int row1,
                                                                int col1,
                                                                int row2,
                                                                int col2,
                                                                int expected) {
        Solution.NumMatrix numMatrix = new Solution.NumMatrix(matrix);
        int actual = numMatrix.sumRegion(row1, col1, row2, col2);

        assertTrue(actual == expected);
    }
}
