package io.github.ololx.leetcode.examples.medium.task1115;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 16.07.2022 08:30
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesFooBarPrintingCount")
    public static Object[][] providesFooBarPrintingCount() {
        return new Object[][] {
                {1, "foobar"},
                {2, "foobarfoobar"},
                {5, "foobarfoobarfoobarfoobarfoobar"}
        };
    }

    @Test(dataProvider = "providesFooBarPrintingCount", invocationCount = 3)
    public void fooBar_whenFooAndBarMethodsExecuteNTimesInDifferentThreads_thenPrintFooBarNTimes(int n,
                                                                                                 String expected) {
        final StringBuffer actual = new StringBuffer();
        final Solution.FooBar fooBar = new Solution.FooBar(n);

        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print bar");
                    try {
                        fooBar.bar(() -> actual.append("bar"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print foo");
                    try {
                        fooBar.foo(() -> actual.append("foo"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                )
        ).join();

        assertEquals(actual.toString(), expected);
    }
}
