package io.github.ololx.leetcode.solutions.medium.task48;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 15.11.2022 13:28
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "provides2Ds")
    public static Object[][] provides2Ds() {
        return new Object[][] {
                {
                    new int[][] {
                            new int[] {1, 2, 3},
                            new int[] {4, 5, 6},
                            new int[] {7, 8, 9}
                    },
                        new int[][] {
                                new int[] {7, 4, 1},
                                new int[] {8, 5, 2},
                                new int[] {9, 6, 3}
                        }
                }
        };
    }

    //@LogParam
    @Test(dataProvider = "provides2Ds")
    public void rotate_whenMatrixExists_thenRotateOn90Degree(int[][] matrix, int[][] expected) {
        new Solution().rotate(matrix);
        assertEquals(matrix, expected);
    }
}
