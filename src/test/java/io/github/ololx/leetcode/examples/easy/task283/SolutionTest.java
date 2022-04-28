package io.github.ololx.leetcode.examples.easy.task283;

import io.github.ololx.leetcode.examples.easy.task283.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 28.04.2022 21:29
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @DataProvider(name = "providesNumsArrays")
    public static Object[][] providesNumsArrays() {
        return new Object[][] {
                {
                    new int[] {0, 1, 0, 3, 12}, new int[] {1, 3, 12, 0, 0}
                },
                {
                    new int[] {0}, new int[] {0}
                }
        };
    }

    @Test(dataProvider = "providesNumsArrays")
    public void moveZeroes_whenNumsArePresented_thenMoveZeros(int[] nums , int[] expected) {
        log.info(
                "Start test with nums = "
                        + Stream.of(nums)
                        .map(num -> num.toString())
                        .collect(Collectors.joining(", "))
        );
        new Solution().moveZeroes(nums);

        log.info(
                "Expected = "
                        + Stream.of(expected)
                        .map(num -> num.toString())
                        .collect(Collectors.joining(", "))
                        + "\nActual = "
                        + Stream.of(nums)
                        .map(num -> num.toString())
                        .collect(Collectors.joining(", "))
        );

        assertEquals(nums, expected);
    }
}
