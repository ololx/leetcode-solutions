package io.github.ololx.leetcode.examples.medium.task59;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static org.testng.Assert.assertEquals;

/**
 * 59. Spiral Matrix II
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getCanonicalName());

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
                }
        };
    }

    @Test(dataProvider = "sizes")
    void generateMatrix_whenMatrixHasNonZeroSize_thenReturnNewSpiralMatrix(int n, int[][] expected) {
        int[][] actual = new Solution().generateMatrix(n);

        assertEquals(expected, actual);

        Arrays.stream(actual).forEach(xr -> {
            Arrays.stream(xr).forEach(xc -> {
                System.out.print(xc + " ");
            });
            System.out.println();
        });
    }
}
