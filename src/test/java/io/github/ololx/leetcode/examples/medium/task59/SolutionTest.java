package io.github.ololx.leetcode.examples.medium.task59;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 59. Spiral Matrix II
 */
public class SolutionTest {

    @Test
    void test() {
        var xx = new Solution().generateMatrix(3);

        Arrays.stream(xx).forEach(xr -> {
            Arrays.stream(xr).forEach(xc -> {
                System.out.print(xc + " ");
            });

            System.out.println();
        });
    }
}
