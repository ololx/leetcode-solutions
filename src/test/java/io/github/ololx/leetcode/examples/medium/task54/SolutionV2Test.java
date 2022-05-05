package io.github.ololx.leetcode.examples.medium.task54;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * 59. Spiral Matrix
 */
public class SolutionV2Test {

    private static final Logger log = Logger.getLogger(SolutionV2Test.class.getCanonicalName());

    @DataProvider(name = "providesMatrixAndList")
    public static Object[][] providesMatrixAndList() {
        return new Object[][] {
                {
                        new int[][]{
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}
                        },
                        List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
                },
                {
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)
                },
                {
                        new int[][]{
                                {1, 2, 3},
                                {8, 9, 4},
                                {7, 6, 5}
                        },
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                },
                {
                        new int[][]{
                                {1}
                        },
                        List.of(1)
                },
                {
                        new int[][]{
                                {1, 2, 3, 4},
                                {12, 13, 14, 5},
                                {11, 16, 15, 6},
                                {10, 9, 8, 7}
                        },
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
                },
                {
                        new int[][]{
                                {1, 2, 3, 4, 5},
                                {16, 17, 18, 19, 6},
                                {15, 24, 25, 20, 7},
                                {14, 23, 22, 21, 8},
                                {13, 12, 11, 10, 9},
                        },
                        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)
                }
        };
    }

    @Test(dataProvider = "providesMatrixAndList")
    void spiralOrder_whenMatrixIsNotNull_thenReturnListInSpiralOrder(int[][] matrix, List<Integer> expected) {
        List<Integer> actual = new SolutionV2().spiralOrder(matrix);
        log.info("Spiral Order - " + actual);

        assertEquals(expected, actual);
    }
}
