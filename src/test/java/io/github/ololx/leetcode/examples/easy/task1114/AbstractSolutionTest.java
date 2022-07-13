package io.github.ololx.leetcode.examples.easy.task1114;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 13.07.2022 09:45
 *
 * @author Alexander A. Kropotin
 */
public abstract class AbstractSolutionTest {

    @DataProvider(name = "providesRunnableOrder")
    public static Object[][] providesRunnableOrder() {
        return new Object[][] {
                {new int[] {1, 2, 3}, new int[] {1, 2, 3}},
                {new int[] {1, 3, 2}, new int[] {1, 2, 3}},
                {new int[] {2, 1, 3}, new int[] {1, 2, 3}},
                {new int[] {2, 3, 1}, new int[] {1, 2, 3}},
                {new int[] {3, 1, 2}, new int[] {1, 2, 3}},
                {new int[] {3, 2, 1}, new int[] {1, 2, 3}}
        };
    }
}
