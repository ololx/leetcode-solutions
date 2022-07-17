package io.github.ololx.leetcode.examples.easy.task1114;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 11.07.2022 19:44
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest extends AbstractSolutionTest {

    @Test(dataProvider = "providesRunnableOrder", invocationCount = 5)
    public void firstSecondThird_whenFooMethodsExecuteInDifferentOrders_thenRunItInExpectedOrder(int[] order,
                                                                                                 int[] expected) {
        int[] actual = new int[3];
        AtomicInteger actualIndex = new AtomicInteger();

        final Solution.Foo foo = new Solution.Foo();
        List<CompletableFuture<Void>> fooFutures = new ArrayList<>() {{
           add(
                   CompletableFuture.runAsync(() -> {
                       try {
                           foo.first(() -> actual[actualIndex.getAndIncrement()] = 1);
                           System.err.println("Run the process num = " + actualIndex.get());
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }}
                   )
           );
            add(
                    CompletableFuture.runAsync(() -> {
                        try {
                            foo.second(() -> actual[actualIndex.getAndIncrement()] = 2);
                            System.err.println("Run the process num = " + actualIndex.get());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }}
                    )
            );
            add(
                    CompletableFuture.runAsync(() -> {
                        try {
                            foo.third(() -> actual[actualIndex.getAndIncrement()] = 3);
                            System.err.println("Run the process num = " + actualIndex.get());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }}
                    )
            );
        }};

        for (int futureIndex : order) {
            fooFutures.get(futureIndex - 1).join();
        }

        assertEquals(actual, expected);
    }
}
