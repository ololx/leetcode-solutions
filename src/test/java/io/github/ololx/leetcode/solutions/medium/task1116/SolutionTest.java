package io.github.ololx.leetcode.solutions.medium.task1116;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 17.07.2022 17:24
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {0, ""},
                {1, "01"},
                {2, "0102"},
                {5, "0102030405"}
        };
    }

    @Test(timeOut = 3000L, dataProvider = "providesN")
    public void zeroEventOdd_whenzeroEventOddMethodsExecuteNTimesInDifferentThreads_thenPrintNumbersInSpecialOrder(int n,
                                                                                                                   String expected) {
        final StringBuffer actual = new StringBuffer();
        final Solution.ZeroEvenOdd zeroEventOdd = new Solution.ZeroEvenOdd(n);

        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print even");
                    try {
                        zeroEventOdd.even(actual::append);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print zero");
                    try {
                        zeroEventOdd.zero(actual::append);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print event");
                    try {
                        zeroEventOdd.odd(actual::append);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                )
        ).join();

        assertEquals(actual.toString(), expected);
    }
}
