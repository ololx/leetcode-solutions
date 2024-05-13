package io.github.ololx.leetcode.solutions.medium.task1195;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.CompletableFuture;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 17.07.2022 17:55
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    @DataProvider(name = "providesN")
    public static Object[][] providesN() {
        return new Object[][] {
                {5, "12fizz4buzz"},
                {12, "12fizz4buzzfizz78fizzbuzz11fizz"},
                {13, "12fizz4buzzfizz78fizzbuzz11fizz13"},
                {14, "12fizz4buzzfizz78fizzbuzz11fizz1314"},
                {15, "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz"},
                {16, "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz16"},
        };
    }

    @Test(timeOut = 30000L, dataProvider = "providesN")
    public void zeroEventOdd_whenzeroEventOddMethodsExecuteNTimesInDifferentThreads_thenPrintNumbersInSpecialOrder(int n, String expected) {
        final StringBuffer actual = new StringBuffer();
        final Solution.FizzBuzz fizzBuzz = new Solution.FizzBuzz(n);

        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print fizz");
                    try {
                        fizzBuzz.fizz(() -> actual.append("fizz"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print buzz");
                    try {
                        fizzBuzz.buzz(() -> actual.append("buzz"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print fizzbuzz");
                    try {
                        fizzBuzz.fizzbuzz(() -> actual.append("fizzbuzz"));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                ),
                CompletableFuture.runAsync(() -> {
                    System.out.println("Print number");
                    try {
                        fizzBuzz.number(actual::append);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }}
                )
        ).join();

        assertEquals(actual.toString(), expected);
    }
}
