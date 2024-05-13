package io.github.ololx.leetcode.solutions.medium.task74;

import io.github.ololx.cranberry.logging.annotation.LogParam;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 09.05.2023 11:12
 *
 * @author Alexander A. Kropotin
 */
public class SolutionV2Test {

    private static final Logger log = Logger.getLogger(SolutionV2Test.class.getName());

    @DataProvider(name = "providesMatrix")
    public static Object[][] providesMatrix() {
        return new Object[][] {
                {
                    new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3, true
                },
                {
                    new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 13, false
                },
                {
                    new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 16, true
                }
        };
    }

    //@LogParam
    @Test(dataProvider = "providesMatrix")
    public void searchMatrix_whenTargetInAMatrix_thenReturnTrue(int[][] matrix,
                                                                int target,
                                                                boolean expected) {
        log.info("Start test with target - " + target);

        boolean actual = new SolutionV2().searchMatrix(matrix, target);
        log.info("Expected - " + expected + ", actual - " + actual);

        assertEquals(actual, expected);
    }
}
