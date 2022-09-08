package io.github.ololx.leetcode.solutions.medium.task59;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

/**
 * 59. Spiral Matrix II
 */
public class SolutionV2Test {

    @DataProvider(name = "sizes")
    public static Object[][] sizes() {
        return new Object[][] {
                {
                    3,
                        new int[][]{
                                {1, 2, 3},
                                {8, 9, 4},
                                {7, 6, 5}
                    }
                },
                {
                        1,
                        new int[][]{
                                {1}
                        }
                },
                {
                        4,
                        new int[][]{
                                {1, 2, 3, 4},
                                {12, 13, 14, 5},
                                {11, 16, 15, 6},
                                {10, 9, 8, 7}
                        }
                },
                {
                        5,
                        new int[][]{
                                {1, 2, 3, 4, 5},
                                {16, 17, 18, 19, 6},
                                {15, 24, 25, 20, 7},
                                {14, 23, 22, 21, 8},
                                {13, 12, 11, 10, 9},
                        }
                }
        };
    }

    @Test(dataProvider = "sizes")
    void generateMatrix_whenMatrixHasNonZeroSize_thenReturnNewSpiralMatrix(int n, int[][] expected) {
        int[][] actual = new SolutionV2().generateMatrix(n);

        Arrays.stream(actual).forEach(xr -> {
            Arrays.stream(xr).forEach(xc -> {
                System.out.print(xc + " ");
            });
            System.out.println();
        });

        assertEquals(expected, actual);
    }
}
